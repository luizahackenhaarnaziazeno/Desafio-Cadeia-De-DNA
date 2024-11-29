import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class ProcessaDNA_String implements IProcessaDNA {
    private String sDna;

    public ProcessaDNA_String() {
        sDna = null;
    }

    public String getDNA(){
        return sDna;
    }

    public boolean carregaDados(String fname) {
        // Assume que o arquivo esta no diretório de execução
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nomeCaminhoCompleto = currDir + "/" + fname;
        System.out.println(nomeCaminhoCompleto);
        Path path = Paths.get(nomeCaminhoCompleto);

        // Usa a classe scanner para fazer a leitura do arquivo
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))) {
            sDna = sc.nextLine();
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
            return false;
        }
        return true;
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
        if (sDna == null) {
            return "none";
        }
        int pos = 0;
        while (pos < sDna.length()-1) {
            if (sDna.charAt(pos) != sDna.charAt(pos + 1)) {
                char nova = IProcessaDNA.defineNova(sDna.charAt(pos), sDna.charAt(pos + 1));
                String antes = antes(sDna, pos);
                String depois = depois(sDna, pos);
                sDna = antes + depois + nova;
                if (pos > 0){
                    pos--;
                }
            } else {
                pos++;
            }
        }
        return sDna;
    }
}