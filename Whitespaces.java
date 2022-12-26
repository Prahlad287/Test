

    public class Whitespaces {
    void free() {
        String write = "Rpa - rajasthan police training academy";
        char[] a = write.toCharArray();
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < a.length; i++) {
            if ((a[i] != ' ') && (a[i] != '\t')) {
                s.append(a[i]);
            }
        }
        String a2 = s.toString();
        System.out.println(a2);
    }
        public static void main(String[] args) {
           Whitespaces w=new Whitespaces();
           w.free();
        }
    }

