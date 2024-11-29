public interface IProcessaDNA {
    public static char defineNova(char l1, char l2) {
        if ((l1 == 'D' && l2 == 'N') || (l1 == 'N' && l2 == 'D'))
            return 'A';
        if ((l1 == 'N' && l2 == 'A') || (l1 == 'A' && l2 == 'N'))
            return 'D';
        return 'N';
    }

    abstract boolean carregaDados(String fname);
    abstract String degradaDNA();
}
