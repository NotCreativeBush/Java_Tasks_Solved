package Task25;

public class SimpleArrayList {
    private static final int INITIAL_CAPACITY = 5;
    private int cap = INITIAL_CAPACITY;
    private int size = 0;
    private int[] arr = new int[cap];

    public SimpleArrayList() {

    }

    public SimpleArrayList(int x) {
        arr[0] = x;
        size = 1;
    }

    public SimpleArrayList(int[] x) {
        System.arraycopy(x, 0, arr, 0, x.length);
        size = x.length;
    }

    public SimpleArrayList(SimpleArrayList simpleArrayList) {
        size = simpleArrayList.size;
        cap = simpleArrayList.cap;
        arr = new int[cap];
        System.arraycopy(simpleArrayList.arr, 0, arr, 0, size);
    }

    public int size() {
        return size;
    }

    public void clear() {
        arr = new int[cap];
        size = 0;
    }

    public void trim() {
        int[] tmp = new int[size];
        cap = size;
        System.arraycopy(arr, 0, tmp, 0, size);
        arr = tmp;
    }

    public SimpleArrayList insert(int ind, int[] other) {
        if (ind > size || ind < 0) {
            throw new IndexOutOfBoundsException();
        }
        int sz = other.length;
        if (size + sz > cap) {
            cap = (size + sz) * 2;
        }
        int[] tmp = new int[cap];
        System.arraycopy(arr, 0, tmp, 0, ind);
        System.arraycopy(other, 0, tmp, ind, sz);
        System.arraycopy(arr, ind, tmp, sz + ind, Math.max(0, size - ind));
        arr = tmp;
        size += sz;
        return this;
    }

    public SimpleArrayList insert(int ind, int e) {
        return insert(ind, new int[]{e});
    }

    public SimpleArrayList append(int e) {
        return insert(size, new int[]{e});
    }

    public SimpleArrayList append(int[] a) {
        return insert(size, a);
    }

    public SimpleArrayList append(SimpleArrayList a) {
        int[] tmp = new int[a.size];
        System.arraycopy(a.arr, 0, tmp, 0, a.size);
        return insert(size, tmp);
    }

    public int get(int ind) {
        if (ind > size || ind < 0) {
            throw new IndexOutOfBoundsException();
        }
        return arr[ind];
    }

    public SimpleArrayList set(int ind, int val) {
        if (ind > size || ind < 0) {
            throw new IndexOutOfBoundsException();
        }
        arr[ind] = val;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("Size: " + size + " Capacity: " + cap + " [ ");
        for (int i = 0; i < size; i++) {
            ans.append(arr[i]).append(" ");
        }
        ans.append("]");
        return ans.toString();
    }

    public static void main(String[] args) {
        SimpleArrayList a = new SimpleArrayList()
                .append(new int[]{1, 3})
                .insert(1, 2)
                .append(6)
                .insert(3, new int[]{4, 5});
        SimpleArrayList b = new SimpleArrayList(a);
        for (int i = 0; i < a.size(); ++i)
            a.set(i, a.get(i) + 6);
        b.append(a)
                .append(13)
                .trim();
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }


}
