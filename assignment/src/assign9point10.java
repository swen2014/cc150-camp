/**
 * Created by steven on 3/23/15.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class assign9point10 {
    static ArrayList<Box> buildTallestStackDP(ArrayList<Box> boxes, Box bottom,
                                             HashMap<Box, ArrayList<Box>> cache) {
        if (cache.containsKey(bottom))
            return cache.get(bottom);

        ArrayList<Box> maxStack = null;
        int maxHeight = 0;
        for (Box b : boxes) {
            if (b.canPlaceAbove(bottom)) {
                ArrayList<Box> newStack = buildTallestStackDP(boxes, b, cache);
                int newHeight = stackHeight(newStack);
                if (newHeight > maxHeight) {
                    maxHeight = newHeight;
                    maxStack = newStack;
                }
            }
        }
        if (maxStack == null) maxStack = new ArrayList<Box>();
        if (bottom != null) maxStack.add(0, bottom);
        cache.put(bottom, maxStack);
        return maxStack;
    }

    static ArrayList<Box> buildTallestStackDP(ArrayList<Box> boxes) {
        if (boxes == null) return null;
        return buildTallestStackDP(boxes, null, new HashMap<Box, ArrayList<Box>>());
    }

    static class Box {
        int width; int length; int height;
        public Box(int w, int l, int h) {width=w;length=l;height=h;}

        boolean canPlaceAbove(Box b) {
            return b == null ||
                    (this.width < b.width &&
                            this.length < b.length &&
                            this.height < b.height);
        }

        @Override
        public String toString() {return "("+width+", "+length+", "+height+")";}
    }

    private static int stackHeight(ArrayList<Box> boxes) {
        int height = 0;
        for (Box b : boxes) {
            height += b.height;
        }
        return height;
    }
}
