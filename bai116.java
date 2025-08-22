import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


class Onl {
    String ten, start, end;
    long on;

    Onl(String ten, String start, String end) {
        this.ten = ten;
        this.start = start;
        this.end = end;

        String[] h = start.split("\\s+");
        String[] k = end.split("\\s+");

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate b = LocalDate.parse(h[0], f);
        LocalDate c = LocalDate.parse(k[0], f);

        long daysBetween = ChronoUnit.DAYS.between(b, c);

        String[] startTime = h[1].split(":");
        long startMinutes = Integer.parseInt(startTime[0]) * 60 + Integer.parseInt(startTime[1]);

        String[] endTime = k[1].split(":");
        long endMinutes = Integer.parseInt(endTime[0]) * 60 + Integer.parseInt(endTime[1]);

        this.on = (endMinutes - startMinutes) + daysBetween * 24 * 60;
    }

    public void in() {
        System.out.println(this.ten + " " + this.on);
    }

    public long getOn() {
        return this.on;
    }

    public String getTen() {
        return this.ten;
    }
}

public class bai116 {
    public static void main(String[] args) {
        try {
            File f = new File("ONLINE.in");
            Scanner sc = new Scanner(f);
            int t = sc.nextInt();
            sc.nextLine();
            List<Onl> ds = new ArrayList<>();
            while (t-- > 0) {
                String ten = sc.nextLine();
                String start = sc.nextLine();
                String end = sc.nextLine();
                ds.add(new Onl(ten, start, end));
            }
            ds.sort(Comparator.comparing(Onl::getOn).reversed().thenComparing(Onl::getTen));
            for (Onl x : ds) {
                x.in();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
