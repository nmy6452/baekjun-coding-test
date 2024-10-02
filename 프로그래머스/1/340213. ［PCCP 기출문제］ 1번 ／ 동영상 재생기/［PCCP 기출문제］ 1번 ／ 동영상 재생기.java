import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

class Solution {
  
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) throws ParseException {

        String answer = "";
        Video video = new Video(video_len,pos,op_start,op_end);


        Arrays.stream(commands).forEach(command ->{
            if (command.equals("next")){
                video.next();
            }
            else if(command.equals("prev")){
                video.prev();
            }
        });

        return video.toString();
    }

}
class Video {
    Date video_len;
    Date video_srart;
    Date pos;
    Date op_start;
    Date op_end;

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
        return formatter.format(pos);
    }

    public Video(String video_len, String pos, String op_start, String op_end) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
        this.video_len = formatter.parse(video_len);
        this.video_srart = formatter.parse("00:00");
        this.pos = formatter.parse(pos);
        this.op_start = formatter.parse(op_start);
        this.op_end = formatter.parse(op_end);

        opSkip();
    }

    public void next(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(pos);
        // 10분 더하기
        cal.add(Calendar.SECOND, 10);
        pos.setTime(cal.getTime().getTime());

        if (pos.after(video_len)){
            pos.setTime(video_len.getTime());
        }
        opSkip();
    }

    public void prev(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(pos);
        // 10분 더하기
        cal.add(Calendar.SECOND, -10);
        pos.setTime(cal.getTime().getTime());
        if (pos.before(video_srart)){
            pos.setTime(video_srart.getTime());
        }
        opSkip();
    }

    public void opSkip(){
        if(pos.after(op_start) && pos.before(op_end)){
            pos.setTime(op_end.getTime());
        }
    }
}
