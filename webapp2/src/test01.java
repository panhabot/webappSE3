public class test01 {

    private Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] decodedText;
    private String[] plainText;
    private java.util.List<Character> alphabetList;

    public test01(){
        alphabetList = java.util.Arrays.asList(alphabet);
        plainText = new String[alphabet.length];
    }

    public String[] producePlaintext(String cipherText) {
        char[] message = cipherText.toUpperCase().toCharArray();
        for (int key = 0; key < alphabet.length; key++) {
            decodedText = new char[message.length];
            for (int i = 0; i < message.length; i++) {

                if (message[i] != ' ') {
                    decodedText[i] = alphabet[(alphabetList.indexOf(message[i])+key) % alphabet.length];
                }else{
                    decodedText[i] = ' ';
                }
            }
            plainText[key] = String.valueOf(decodedText);
        }
        return plainText;
    }

    public static void main(String[] args) {
        test01 t = new test01();
        for(String pt : t.producePlaintext("hello")) {
            System.out.println(pt);
        }
    }

}
