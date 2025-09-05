public class Example {
    int a;
    int b;
    int ans;

    public Example(int m, int n) {
        a = m;
        b = n;
    }

    public int Function_A(int y) {
        if (y > 0) {
            ans = y + a;
        } else{
            ans = y - a;
        }
        return ans;
    }

    public int Function_B(int x) {
        if (x < 6) {
            ans = x + b;
        } else {
            ans = x - b;
        }
        return ans;
    }
}
