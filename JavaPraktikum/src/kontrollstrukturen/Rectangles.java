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
	}
}
