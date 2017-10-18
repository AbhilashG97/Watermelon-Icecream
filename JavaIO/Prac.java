public class Prac {

    private DataInputStream in = null;
    private DataOutputStream out = null;
    private int l;
    private ArrayList<Integer> list;

    public Prac(String inputFile, String outputFile) throws Exception {
        in = new DataInputStream(new FileInputStream(inputFile));
        out = new DataOutputStream(new FileOutputStream(outputFile));
        l = 0;
        list = new ArrayList<>();
    }

    public void calculate() throws Exception {
        while ((l = in.readInt()) != -1) {
            list.add(l);
        }
    }

    public int getMax() throws Exception {
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

} 