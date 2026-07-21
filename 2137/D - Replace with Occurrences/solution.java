import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class ReplaceWithOccurrences {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner, out);
        }
        out.flush();
        scanner.close();
    }
 
    public static void solve(Scanner scanner, PrintWriter out) {
        int n = scanner.nextInt();
 
        // Step 1: Group indices based on the value in b.
        // The key is the value from b, the value is a list of indices where it appears.
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int b_val = scanner.nextInt();
            groups.computeIfAbsent(b_val, k -> new ArrayList<>()).add(i);
        }
 
        // Step 2: Check the necessary condition.
        // For each value v, its frequency in b must be divisible by v.
        for (int v : groups.keySet()) {
            if (groups.get(v).size() % v != 0) {
                out.println(-1);
                // After reading the rest of the line to not mess up the next test case
                // This is only needed if we were using a mix of nextInt and nextLine.
                // For only nextInt, the scanner handles it. But it's good practice.
                // scanner.nextLine(); 
                return;
            }
        }
 
        // Step 3: If the condition holds, construct the array a.
        int[] a = new int[n];
        int assignedValueCounter = 0;
 
        // Process each group of indices. Order doesn't matter.
        for (int v : groups.keySet()) {
            List<Integer> indices = groups.get(v);
            // Partition the list of indices into chunks of size v.
            for (int i = 0; i < indices.size(); i++) {
                // Assign a new, unique value to each chunk.
                if (i % v == 0) {
                    assignedValueCounter++;
                }
                int originalIndex = indices.get(i);
                a[originalIndex] = assignedValueCounter;
            }
        }
 
        // Step 4: Print the resulting array.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(" ");
        }
        out.println(sb.toString().trim());
    }
}