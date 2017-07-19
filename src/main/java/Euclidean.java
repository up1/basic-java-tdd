public class Euclidean {

    public static void main(String[] args) {
        Euclidean e = new Euclidean();
        System.out.println(e.gcd(24, 9));
    }

    public int gcd(int ตัวที่หนึ่ง, int ตัวที่สอง) {
        if( ตัวที่หนึ่ง == ตัวที่สอง )
            return ตัวที่หนึ่ง;
        if( ตัวที่หนึ่ง>ตัวที่สอง ) {
            return gcd(ตัวที่หนึ่ง-ตัวที่สอง, ตัวที่สอง);
        } else {
            return gcd(ตัวที่หนึ่ง, ตัวที่สอง - ตัวที่หนึ่ง);
        }
    }

}
