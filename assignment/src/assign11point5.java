/**
 * Created by steven on 3/29/15.
 */
public class assign11point5 {
    static int search(String[] a, String x, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high-low)/2;
        if (a[mid].isEmpty()) {// if a[mid] is empty, move to *first* non-empty item
            int l = mid - 1;
            int r = mid + 1;
            while (l >= low && r <= high) {
                if (!a[l].isEmpty()) {
                    mid = l;
                    break;
                }
                else if (!a[r].isEmpty()) {
                    mid = r;
                    break;
                }
                --l;
                ++r;
            }
        }

        if (a[mid].equals(x)) {
            return mid;
        }
        else if (a[mid].compareTo(x) < 0) {
            return search(a, x, mid + 1, high);
        }
        else {
            return search(a, x, low, mid - 1);
        }
    }

    static int search(String[] a, String x) {
        if (a == null || x == null || x.isEmpty()) return -1;
        return search(a, x, 0, a.length - 1);
    }
}
