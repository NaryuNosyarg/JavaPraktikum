package kontrollstrukturen;

public class Rectangles {
	public static void main(String[] args){
	
	int i = 0;
	int px = Integer.parseInt(args[i++]);
	int py = Integer.parseInt(args[i++]);
	int qx = Integer.parseInt(args[i++]);
	int qy = Integer.parseInt(args[i++]);
	int sx = Integer.parseInt(args[i++]);
	int sy = Integer.parseInt(args[i++]);
	int tx = Integer.parseInt(args[i++]);
	int ty = Integer.parseInt(args[i++]);
	
    final int r1left = Math.min(px, qx);
    final int r1right = Math.max(px, qx);
    final int r1bottom = Math.min(py, qy);
    final int r1top = Math.max(py, qy);
    final int r2left = Math.min(sx, tx);
    final int r2right = Math.max(sx, tx);
    final int r2bottom = Math.min(sy, ty);
    final int r2top = Math.max(sy, ty);
    

    if(r1right < r2left
            || r1left > r2right
            || r1top < r2bottom
            || r1bottom > r2top)
        System.out.println("disjoint");
    else if(r1right == r2left
            || r1left == r2right
            || r1top == r2bottom
            || r1bottom == r2top)
        if((r1right == r2left  || r1left == r2right)
                && (r1top == r2bottom  || r1bottom == r2top))
            System.out.println("touching");
        else
            System.out.println("aligned");
    else if(r1left == r2left
            && r1right == r2right
            && r1top == r2top
            && r1bottom == r2bottom)
        System.out.println("same");
    else if(r1left >= r2left
            && r1right <= r2right
            && r1top <= r2top
            && r1bottom >= r2bottom)
        System.out.println("contained");
    else if(r2left >= r1left
            && r2right <= r1right
            && r2top <= r1top
            && r2bottom >= r1bottom)
        System.out.println("contained");
    else
        System.out.println("intersecting");
	}
}
