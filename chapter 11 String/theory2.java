//find sortest path
//tc is O(n) and sc is O(1).
/*  in this question one person is standing on (0,0) cordinate of graph here he is waking 
according to entered string for example input string is wneee so he is walking one step in
west and then one step in north and then three step in east so he is now standing on (2,1)
so here we find min distance between (0,0) and (2,1) and this distance is 
sqrt((x1-x2)^2 + (y1-y2)^2). */
public class theory2 {
    public static void main(String args[]) {
        System.out.println("your sortest path is " + sortestpath("WNEENESENNN"));
    }

    public static float sortestpath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'N':
                    y++;
                    break;
            }
        }
        return (float) Math.sqrt((x * x) + (y * y));
    }
}