import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ProcessaDNA_LinkedListIterator implements IProcessaDNA {
    private LinkedList<Character> dnaList;

    public ProcessaDNA_LinkedListIterator() {
        dnaList = new LinkedList<>();
    }

    public LinkedList<Character> getDNAList() {
        return dnaList;
    }

    public boolean carregaDados(String fname) {
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nomeCaminhoCompleto = currDir + "/" + fname;
        System.out.println(nomeCaminhoCompleto);
        Path path = Paths.get(nomeCaminhoCompleto);

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

        ListIterator<Character> iterator = dnaList.listIterator();
        while (iterator.hasNext()) {
            int currentIndex = iterator.nextIndex();
            if (currentIndex < dnaList.size() - 1) {
                char currentChar = iterator.next();
                char nextChar = dnaList.get(currentIndex + 1);
                if (currentChar != nextChar) {
                    char nova = IProcessaDNA.defineNova(currentChar, nextChar);
                    iterator.remove();
                    if (iterator.hasPrevious()) {
                        iterator.previous(); // Move o iterador de volta
                    }
                    iterator.add(nova);
                }
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (char c : dnaList) {
            resultBuilder.append(c);
        }
        return resultBuilder.toString();
    }
}
