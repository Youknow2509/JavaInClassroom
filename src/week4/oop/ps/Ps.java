package week4.oop.ps;

import java.util.ArrayList;

public class Ps {
    private int T, M;

    public Ps(int T, int M) {
        this.T = T;
        this.M = M;
    }

    public Ps() {
        this.T = 0;
        this.M = 1;
    }

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    @Override
    public String toString() {
        return "Ps{" +
                "T=" + T +
                ", M=" + M +
                '}';
    }

    public double getPs() {
        if ( M != 0) {
            return (double) T / M;
        }
        return Double.MAX_VALUE;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    private void toigiam() {
        int gcd = gcd(T, M);
        T /= gcd;
        M /= gcd;
    }

    // Phương thức tính ước chung lớn nhất

    public Ps tong(Ps b) {
        Ps res = new Ps();
        res.setT(T*b.getM() + b.getT()*M);
        res.setM(M*b.getM());
        res.toigiam();
        return res;
    }
    public Ps hieu(Ps b) {
        Ps res = new Ps();
        res.setT(T*b.getM() - b.getT()*M);
        res.setM(M*b.getM());
        res.toigiam();
        return res;
    }
    public Ps tich(Ps b) {
        Ps res = new Ps();
        res.setT(T*b.getT());
        res.setM(M*b.getM());
        res.toigiam();
        return res;
    }
    public Ps thuong(Ps b) {
        Ps res = new Ps();
        res.setT(T*b.getT());
        res.setM(b.getT()*M);
        res.toigiam();
        return res;
    }
    public boolean equals(Ps b) {
        return T*b.getM() == b.getT()*M;
    }
    public Ps getMaxElement(ArrayList<Ps> arr) {
        Ps max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max.getPs() < arr.get(i).getPs()) {
                max = arr.get(i);
            }
        }
        return max;
    }
    public Ps sumList(ArrayList<Ps> arr) {
        Ps res = new Ps();
        for (Ps ps : arr) {
            res = res.tong(ps);
        }
        return res;
    }
    public int countNotInteger(ArrayList<Ps> arr) {
        int count = 0;
        for (Ps ps : arr) {
            if (ps.getT() % ps.getM() != 0) {
                count++;
            }
        }
        return count;
    }
}
