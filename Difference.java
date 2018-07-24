public class Difference {
    private int[] elements;
    public int maximumDifference;
    
    Difference(int[] a) {
        this.elements = a;
    }
    
    void computeDifference() {
        maximumDifference = 0;
        for(int i = 0; i < elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                int k = elements[i] - elements[j];
                if(k > maximumDifference) {
                    maximumDifference = k;
                }
            }
        }
    }
    
}
