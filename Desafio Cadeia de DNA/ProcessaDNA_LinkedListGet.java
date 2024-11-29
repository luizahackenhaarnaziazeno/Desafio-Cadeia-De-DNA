import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class ProcessaDNA_LinkedListGet implements IProcessaDNA {
    private LinkedList<Character> dnaLinkedList;

    public ProcessaDNA_LinkedListGet() {
        dnaLinkedList = new LinkedList<>();
    }

    public LinkedList<Character> getDNAList() {
        return dnaLinkedList;
    }

    @Override
    public boolean carregaDados(String fname) {
        // Assume que o arquivo está no diretório de execução
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nomeCaminhoCompleto = currDir + "/" + fname;
        System.out.println(nomeCaminhoCompleto);
        Path path = Paths.get(nomeCaminhoCompleto);

        // Usa a classe scanner para fazer a leitura do arquivo
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                for (char c : line.toCharArray()) {
                    dnaLinkedList.add(c);
                }
            }
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
            return false;
        }
        return true;
    }

    private Character[] toArray() {
        Character[] array = new Character[dnaLinkedList.size()];
        dnaLinkedList.toArray(array);
        return array;
    }

    private String listToString() {
        StringBuilder sb = new StringBuilder();
        for (Character c : dnaLinkedList) {
            sb.append(c);
        }
        return sb.toString();
    }

    private String antes(String dna, int pos) {
        if (pos == 0)
            return "";
        return dna.substring(0, pos);
    }

    private String depois(String dna, int pos) {
        if (pos >= dna.length() - 2) {
            return "";
        }
        return dna.substring(pos + 2);
    }

    @Override
    public String degradaDNA() {
        if (dnaLinkedList.isEmpty()) {
            return "none";
        }
        int pos = 0;
        while (pos < dnaLinkedList.size() - 1) {
            if (!dnaLinkedList.get(pos).equals(dnaLinkedList.get(pos + 1))) {
                char nova = IProcessaDNA.defineNova(dnaLinkedList.get(pos), dnaLinkedList.get(pos + 1));
                dnaLinkedList.remove(pos);
                dnaLinkedList.remove(pos);
                dnaLinkedList.add(pos, nova);
                if (pos > 0) {
                    pos--;
                }
            } else {
                pos++;
            }
        }
        return listToString();
    }
}
