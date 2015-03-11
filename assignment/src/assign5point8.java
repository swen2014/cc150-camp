/**
 * Created by steven on 2/11/15.
 */
public class assign5point8 {
    static void drawLine(byte[] screen, int width_bytes, int x1, int x2, int y)
    {
        int start_offset = x1 % 8;
        int first_full_byte = x1 / 8;
        if(start_offset !=0)
            first_full_byte++;

        int end_offset = x2 %8;
        int last_full_byte = x2 / 8;
        if(end_offset != 7)
            last_full_byte--;

        int row_pos = width_bytes * y;

        byte start_mask = (byte) (0xFF >> start_offset);
        byte end_mask = (byte) ~(0xFF >> (end_offset + 1));


        if( x1 / 8 == x2 /8)
        {
            byte mask = (byte) (start_mask & end_mask);
            screen[ row_pos + x1/8 - 1] |= mask;
            return;
        }

        for(int col=first_full_byte; col<=last_full_byte; col++)
        {
            screen[ row_pos + col] = (byte)0xFF;
        }


        if(start_offset !=0)
            screen[ row_pos + first_full_byte -1] |= start_mask;

        if(end_offset != 7)
            screen[ row_pos + last_full_byte + 1] |= end_mask;
    }
}
