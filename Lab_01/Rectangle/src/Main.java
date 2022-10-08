import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int newX = 5;
        int newY = 5;

        double area;
        double perimeter;

        //begin
//OLD SOLUTION
//        Rectangle rct = new Rectangle();
//        rct.setBounds(x, y, width, height);
//        //System.out.println(rct.getBounds());
//
//        rct.setLocation((int)rct.getX() + newX, (int)rct.getY() + newY);
//
//        Rectangle[] rctSide = new Rectangle[3];
//        for (int i = 0; i < 3; i++) {
//            rctSide[i] = new Rectangle();
//
//            int offset = (i + 1) * (int)rct.getWidth();
//            rctSide[i].setBounds(offset + newX, newY, (int)rct.getWidth(), (int)rct.getHeight());
//            //System.out.println("\t" + rctSide[i].getBounds());
//        }
//
//        Rectangle box = new Rectangle();
//        box.setBounds(
//                (int)rct.getX(),
//                (int)rct.getY(),
//                (int)rct.getWidth() * 4,
//                (int)rct.getHeight()
//        );
//
//        area = box.getWidth() * box.getHeight();
//        perimeter = box.getWidth() * 2 + box.getHeight() * 2;

        Rectangle box = new Rectangle(x, y, width, height);
        box.setLocation(newX, newY);

        for (int i = 0; i < 3; i++) {
            Rectangle newBox = new Rectangle(box.x + box.width, box.y, width, height);
            box.add(newBox);
        }

        area = box.width * box.height;
        perimeter = (box.width + box.height) * 2;

        //end

        System.out.println(box);
        System.out.println(area);
        System.out.println(perimeter);

    }
}