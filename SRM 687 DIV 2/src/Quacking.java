public class Quacking {

    public int quack(String s) {
        String quack = "quack";
        int total = 0;
        int quackindex = 0;
        while (!s.isEmpty()) {
            String next = "";
            for (char c : s.toCharArray()) {
                //found a greedily matched letter that is optimally belonging to the current duck
                if (c == quack.charAt(quackindex % 5))
                    quackindex++;
                else // the letter cannot belong to the current duck keep it
                    next +=c;
            }
            //if there is an incomplete quacking or no progress this is invalid
            if(quackindex%5 != 0 || next.equals(s))
                return -1;
            total+=1;
            s=next;
        }

        return total;
    }
}
