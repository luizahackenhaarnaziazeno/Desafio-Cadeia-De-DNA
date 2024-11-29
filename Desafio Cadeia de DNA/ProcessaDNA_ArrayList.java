import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessaDNA_ArrayList implements IProcessaDNA {
    private ArrayList<Character> dnaList;

    public ProcessaDNA_ArrayList() {
        dnaList = new ArrayList<>();
    }

    public ArrayList<Character> getDNAList() {
        return dnaList;
    }

    public boolean carregaDados(String fname) {
        // Assume que o arquivo está no diretório de execução
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nomeCaminhoCompleto = currDir + "/" + fname;
        System.out.println(nomeCaminhoCompleto);
        Path path = Paths.get(nomeCaminhoCompleto);

        // Usa a classe Scanner para fazer a leitura do arquivo
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))) {
            String dnaString = sc.nextLine();
            for (char c : dnaString.toCharArray()) {
                dnaList.add(c);
            }
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
            return false;
        }
        return true;
    }

    @Override
    public String degradaDNA() {
        if (dnaList.isEmpty()) {
            return "none";
        }

        int pos = 0;
        while (pos < dnaList.size() - 1) {
            if (dnaList.get(pos) != dnaList.get(pos + 1)) {
                char nova = IProcessaDNA.defineNova(dnaList.get(pos), dnaList.get(pos + 1));
                dnaList.remove(pos);
                dnaList.remove(pos); // Remove a próxima também, já que a atual mudou
                dnaList.add(pos, nova);
                if (pos > 0) {
                    pos--;
                }
            } else {
                pos++;
            }
        }

        // Convertendo ArrayList de caracteres de volta para uma String
        StringBuilder sb = new StringBuilder();
        for (char c : dnaList) {
            sb.append(c);
        }
        return sb.toString();
    }
}
