package SelecctionSort;

public class SelectionsSort {
    private String[] data;

    public void setData(String[] data) {
        this.data = data;
    }

    public void Sort() {

        int i, j, counter_i;
        String small;
        int n = this.data.length;
        for (i = 0; i < n - 1; i++) {
            counter_i = i;

            for (j = i + 1; i < n; i++) {
                if (this.data[i].compareTo(this.data[counter_i]) < 0) {
                    small = this.data[i];

                    String temp = this.data[j];
                    this.data[j] = this.data[i];
                    this.data[i] = temp;
                }

            }

        }
    }

    public void PrintSort() {
        for (int i = 0; i < this.data.length; i++) {
            System.out.println(this.data[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] mahasiswa ={"winda" ,"edu", "ary" ,"oki" ,"arie"};
        //String[] mahasiswa = args;//{"winda" ,"edu", "ary" ,"oki" ,"arie"};
        SelectionsSort _mySS = new SelectionsSort();
        _mySS.setData(mahasiswa);
        _mySS.Sort();
        _mySS.PrintSort();
    }
}


