package com.example.toanncth.quizapp;

/**
 * Created by ToanNcTh on 3/28/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class QuizHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "mathsone";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    private static final String TABLE_QUEST1 = "quest1";
    private static final String TABLE_QUEST2 = "quest2";
    private static final String TABLE_QUEST3 = "quest3";
    private static final String TABLE_QUEST4 = "quest4";
    private static final String TABLE_QUEST5 = "quest5";
    private static final String TABLE_QUEST6 = "quest6";
    private static final String TABLE_QUEST7 = "quest7";
    private static final String TABLE_QUEST8 = "quest8";
    // tasks Table Columns names
    private static final String KEY_ID = "qid";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; // correct option
    private static final String KEY_OPTA = "opta"; // option a
    private static final String KEY_OPTB = "optb"; // option b
    private static final String KEY_OPTC = "optc"; // option c
    private static final String KEY_OPTD = "optd"; // option score

    private static final String KEY_IDHS = "qid1"; // option score
    private static final String KEY_LOAI = "loai";
    private static final String KEY_HIGH = "high";

    private SQLiteDatabase dbase;

    public QuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";

        String sql1 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST1 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        String sql2 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST2 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        String sql3 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST3 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        String sql4 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST4 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        String sql5 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST5 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        String sql6 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST6 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        String sql7 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST7 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        String sql8 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST8 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_LOAI
                + " TEXT, " + KEY_HIGH + "TEXT)";
        db.execSQL(sql);
        db.execSQL(sql1);
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);
        db.execSQL(sql5);
        db.execSQL(sql6);
        db.execSQL(sql7);
        db.execSQL(sql8);
        addQuestion0();
        addQuestion1();
        addQuestion2();
        addQuestion3();
        addQuestion4();
        addQuestion5();
        addQuestion6();
        addQuestion7();
        addQuestion8();
        // db.close();
    }

    private void addQuestion0() {
        Question q1 = new Question("APEC là từ viết tắt của tổ chức liên kết kinh tế khu vực nào?",
                "Hiệp ước thương mại tự do Bắc Mỹ", "Liên minh châu Âu", "Diễn đàn hợp tác kinh tế châu Á – Thái Bình Dương", "Diễn đàn hợp tác kinh tế châu Á – Thái Bình Dương");
        this.addQuestion(q1, TABLE_QUEST);
        Question q2 = new Question("Chi-lê là quốc gia thuộc châu lục nào?",
                "Châu Á ", "Châu Âu", "Châu Mỹ", "Châu Mỹ");
        this.addQuestion(q2, TABLE_QUEST);
        Question q3 = new Question("Lượng khí nào trong không khí tăng nhanh gây ra hiện tượng hiệu ứng nhà kính?",
                "N2", "CO2", "H2", "CO2");
        this.addQuestion(q3, TABLE_QUEST);
        Question q4 = new Question("Việt Nam gia nhập ASEAN năm nào?",
                "1993", "1994", "1995", "1995");
        this.addQuestion(q4, TABLE_QUEST);
        Question q5 = new Question("Nền công nghiệp nào đứng thứ hai thế giới?",
                "Nhật Bản", "Mỹ", "Trung Quốc", "Trung Quốc");
        this.addQuestion(q5, TABLE_QUEST);
        Question q6 = new Question("Trong thế chiến thứ hai, thành phố nào của Nhật Bản bị ném bom nguyên tử?",
                "Hirosima và Nagasaki", "Hirosima và Kyoto", "Tokyo và Hirosima", "Hirosima và Nagasaki");
        this.addQuestion(q6, TABLE_QUEST);
        Question q7 = new Question("Phần mềm nào dùng để nén dữ liệu?",
                "Vietkey", "Winrar", "Unikey", "Winrar");
        this.addQuestion(q7, TABLE_QUEST);
        Question q8 = new Question("Chim kiwi là loài chim đặc thù của nước nào?",
                "Australia", "Newzealand", "Thụy Điển", "Newzealand");
        this.addQuestion(q8, TABLE_QUEST);
        Question q9 = new Question("Phân biệt cua đực, cua cái bằng gì?",
                "Càng", "Số chân", "Cái yếm", "Cái yếm");
        this.addQuestion(q9, TABLE_QUEST);
        Question q10 = new Question("Acsimet nói “Ơ rê ca” có nghĩa là gì?",
                "Tìm ra rồi!", "Vui quá!", "Nghe thấy rồi!", "Tìm ra rồi!");
        this.addQuestion(q10, TABLE_QUEST);
    }

    private void addQuestion1() {
        Question q1 = new Question("5+2 = ?", "7", "8", "6", "7");
        this.addQuestion(q1, TABLE_QUEST1);
        Question q2 = new Question("0+1 = ?", "1", "0", "10", "1");
        this.addQuestion(q2, TABLE_QUEST1);
        Question q3 = new Question("9-9 = ?", "0", "9", "1", "0");
        this.addQuestion(q3, TABLE_QUEST1);
        Question q4 = new Question("10-3 = ?", "6", "7", "8", "7");
        this.addQuestion(q4, TABLE_QUEST1);
        Question q5 = new Question("3+6 = ?", "8", "7", "9", "9");
        this.addQuestion(q5, TABLE_QUEST1);
        Question q6 = new Question("1+5 = ?", "6", "7", "5", "6");
        this.addQuestion(q6, TABLE_QUEST1);
        Question q7 = new Question("7-5 = ?", "3", "2", "6", "2");
        this.addQuestion(q7, TABLE_QUEST1);
        Question q8 = new Question("7-2 = ?", "7", "6", "5", "5");
        this.addQuestion(q8, TABLE_QUEST1);
        Question q9 = new Question("3+5 = ?", "8", "7", "5", "8");
        this.addQuestion(q9, TABLE_QUEST1);
        Question q10 = new Question("12-10 = ?", "1", "2", "3", "2");
        this.addQuestion(q10, TABLE_QUEST1);
    }

    private void addQuestion2() {
        Question q1 = new Question("Ai là tác giả bài thơ 'Tiểu đội xe không kính'?",
                "Phạm Tiến Duật", "Chính Hữu", "Nguyễn Duy", "Phạm Tiến Duật");
        this.addQuestion(q1, TABLE_QUEST2);
        Question q2 = new Question("Bác Hồ rời bến Cảng nhà rồng ra đi tìm đường cứu nước vào thời gian nào?",
                "06/05/1911", "05/06/1911", "06/05/1901", "05/06/1911");
        this.addQuestion(q2, TABLE_QUEST2);
        Question q3 = new Question("Ngày thành lập ĐCSVN?",
                "2/3/1930", "2/4/1930", "3/2/1930", "3/2/1930");
        this.addQuestion(q3, TABLE_QUEST2);
        Question q4 = new Question("Bài thơ Sóng là do ai sáng tác?",
                "Xuân Diệu", "Xuân Quỳnh", "Huy Cận", "Xuân Quỳnh");
        this.addQuestion(q4, TABLE_QUEST2);
        Question q5 = new Question("Ngày nào là ngày chiến thắng Chiến dịch Điện Biên Phủ",
                "7/5/1954", "5/7/1955", "6/5/1954", "7/5/1954");
        this.addQuestion(q5, TABLE_QUEST2);
        Question q6 = new Question("Ai là tác giả bài văn 'Dế mèn phiêu lưu ký'?",
                "Tố Hữu", "Tô Hoài", "Nguyễn Du", "Tô Hoài");
        this.addQuestion(q6, TABLE_QUEST2);
        Question q7 = new Question("Truyện Kiều là tập thơ nổi tiếng của đại thi hào nào ?",
                "Nguyễn Du", "Tản Đà", "Bác Hồ", "Nguyễn Du");
        this.addQuestion(q7, TABLE_QUEST2);
        Question q8 = new Question("Ngày nào là ngày kỉ niệm chiến thắng Phát xít Đức ?",
                "7/5", "9/5", "11/5", "9/5");
        this.addQuestion(q8, TABLE_QUEST2);
        Question q9 = new Question("Nhật ký trong tù là tập thơ của ai ?",
                "Bác Hồ", "Xuân Diệu", "Hàn Mặc Tử", "Bác Hồ");
        this.addQuestion(q9, TABLE_QUEST2);
        Question q10 = new Question("Ngày giải phóng Đà Nẵng là vào ngày tháng năm nào ?",
                "30/3/1975", "26/3/1975", "29/3/1975", "29/3/1975");
        this.addQuestion(q10, TABLE_QUEST2);
    }

    private void addQuestion3() {
        Question q1 = new Question("Quần đảo Trường Sa thuộc ?", "Tỉnh Khánh Hoà", "Tỉnh Quảng Ngãi", "Thành phố Đà Nẵng", "Tỉnh Khánh Hoà");
        this.addQuestion(q1, TABLE_QUEST3);
        Question q2 = new Question("Quốc gia Đông Nam Á có dân số đông hơn nước ta là ?", "Thái Lan", " In-đô-nê-xi-a", "Mi-an-ma", " In-đô-nê-xi-a");
        this.addQuestion(q2, TABLE_QUEST3);
        Question q3 = new Question("Đây là hạn chế lớn nhất của cơ cấu dân số trẻ ?", " Gây sức ép lên vấn đề giải quyết việc làm", "Khó hạ tỉ lệ tăng dân", "Gánh nặng phụ thuộc lớn", " Gây sức ép lên vấn đề giải quyết việc làm");
        this.addQuestion(q3, TABLE_QUEST3);
        Question q4 = new Question("Quốc gia nào có diện tích nhỏ nhất thế giới ?", "Libi", "Vantican", "Monaco", "Vantican");
        this.addQuestion(q4, TABLE_QUEST3);
        Question q5 = new Question("Quốc gia nào có nhiều hồ nước nhất thế giới ?", "Trung Quốc", "Nga", "Canada", "Canada");
        this.addQuestion(q5, TABLE_QUEST3);
        Question q6 = new Question("Thác nước tự nhiên, không ngắt quãng cao nhất thế giới nằm ở đâu ?", "Nam Phi", "Venezuela", "Bolivia", "Venezuela");
        this.addQuestion(q6, TABLE_QUEST3);
        Question q7 = new Question("Dãy núi nào dài nhất thế giới ?", "Himalaya", "Andes", "Rockey", "Andes");
        this.addQuestion(q7, TABLE_QUEST3);
        Question q8 = new Question("Thủ đô của Thổ Nhĩ Kỳ là thành phố nào ?", "Gionevo", "Ankara", "Instanbul", "Ankara");
        this.addQuestion(q8, TABLE_QUEST3);
        Question q9 = new Question("Thủ đô hành chính của Nam Phi là thành phố nào ?", "Pretoria", "Cape Town", "Bloemfontein", "Pretoria");
        this.addQuestion(q9, TABLE_QUEST3);
        Question q10 = new Question("Thủ đô của Australia là thành phố nào ?", "Canberra", "Sydney", "Melbourne", "Canberra");
        this.addQuestion(q10, TABLE_QUEST3);
    }

    private void addQuestion4() {
        Question q1 = new Question("Có một tàu điện đi về hướng nam. Gió hướng tây bắc. Vậy khói từ con tàu sẽ theo hướng nào? ?", "Tây", "Bắc", "Không hướng nào", "Không hướng nào");
        this.addQuestion(q1, TABLE_QUEST4);
        Question q2 = new Question("Làm thế nào để không đụng phải ngón tay khi bạn đập búa vào một cái móng tay?", "Tay trái", "Tay phải", "Cả hai tay", "Cả hai tay");
        this.addQuestion(q2, TABLE_QUEST4);
        Question q3 = new Question("Nếu bạn nhìn thấy con chim đang đậu trên nhánh cây, làm sao để lấy nhánh cây mà không làm động con chim?", "Cứ đến mà lấy", "Đợi chim bay đi", "Ru chim ngủ rồi lấy", "Đợi chim bay đi");
        this.addQuestion(q3, TABLE_QUEST4);
        Question q4 = new Question("Miệng rộng lớn nhưng không nói một từ, là con gì? ", "Con sông", "Con sâu", "Con voi", "Con sông");
        this.addQuestion(q4, TABLE_QUEST4);
        Question q5 = new Question("Có bao nhiêu chữ C trong câu sau: \"Cơm, canh, cá, tất cả em đều thích\"?", "1", "2", "3", "1");
        this.addQuestion(q5, TABLE_QUEST4);
        Question q6 = new Question("Cái gì bạn không mượn mà trả?", "Lời cảm ơn", "Tình", "Không thứ gì cả", "Lời cảm ơn");
        this.addQuestion(q6, TABLE_QUEST4);
        Question q7 = new Question("Cái gì luôn đi đến mà không bao giờ đến nơi?", "Cơn gió", "Tình yêu", "Ngày mai", "Ngày mai");
        this.addQuestion(q7, TABLE_QUEST4);
        Question q8 = new Question("8 chia 4 = ?", "4/3", "5/3", "2", "4/3");
        this.addQuestion(q8, TABLE_QUEST4);
        Question q9 = new Question("Có 2 người cha và 2 người con cùng chia đều số tiền là 27 nghìn. Hỏi mỗi người được bao nhiều?", "6.75", "7", "9", "9");
        this.addQuestion(q9, TABLE_QUEST4);
        Question q10 = new Question("Có 1 đàn chuột điếc đi ngang qua hố cống, hỏi có mấy con?", "12", "24", "36", "24");
        this.addQuestion(q10, TABLE_QUEST4);
        Question q11 = new Question("Cái gì mà đi thì nằm, đứng cũng nằm, nhưng nằm lại đứng?", "Cái bàn", "Bàn chân", "Bàn tay", "Bàn chân");
        this.addQuestion(q11, TABLE_QUEST4);
        Question q12 = new Question("Một kẻ giết người bị kết án tử hình. Hắn ta phải chọn một trong ba căn phòng: phòng thứ nhất lửa cháy dữ dội, phòng thứ hai đầy sư tử nhịn đói trong ba năm. Phòng nào an toàn nhất cho hắn?", "1", "2", "Không phòng nào", "2");
        this.addQuestion(q12, TABLE_QUEST4);
        Question q13 = new Question("Chồng người da đen, vợ người da trắng vừa sinh một đứa bé, răng của nó màu gì?", "Đen", "Trắng", "Vàng", "Trắng");
        this.addQuestion(q13, TABLE_QUEST4);
        Question q14 = new Question("Có 1 đàn chuột điếc đi ngang qua hố cống, hỏi có mấy con?", "12", "24", "36", "24");
        this.addQuestion(q14, TABLE_QUEST4);
        Question q15 = new Question("Có 1 đàn chuột điếc đi ngang qua hố cống, hỏi có mấy con?", "12", "24", "36", "24");
        this.addQuestion(q15, TABLE_QUEST4);
    }

    private void addQuestion5() {
        Question q1 = new Question("Có một đàn vịt, cho biết 1 con đi trước thì có 2 con đi sau, 1 con đi sau thì có 2 con đi trước, 1 con đi giữa thì có 2 con đi 2 bên. Hỏi đàn vịt đó có mấy con?", "1", "2", "3", "3");
        this.addQuestion(q1, TABLE_QUEST5);
        Question q2 = new Question("Làm thế nào để qua được câu này?", "Bỏ cuộc", "Cho tôi qua đi mà", "Không thể qua", "Bỏ cuộc");
        this.addQuestion(q2, TABLE_QUEST5);
        Question q3 = new Question("Sở thú bị cháy, con gì chạy ra đầu tiên?", "Con người", "Con chim", "Con rắn", "Con người");
        this.addQuestion(q3, TABLE_QUEST5);
        Question q4 = new Question(" Con Hổ bị xích vào gốc cây, sợi xích dài 30m. Có 1 bụi cỏ cách đấy 31m, làm sao con Hổ ăn được bụi cỏ?", "Cắn đứt xích", "Gọi đồng bọn", "Không khả thi", "Không khả thi");
        this.addQuestion(q4, TABLE_QUEST5);
        Question q5 = new Question("Người đẹp Monalisa không có thứ gì?", "Chồng", "Lông chân", "Lông mày", "Chồng");
        this.addQuestion(q5, TABLE_QUEST5);
        Question q6 = new Question("Bệnh gì bác sỹ bó tay?", "HIV", "Gãy tay", "Bệnh sĩ", "Gãy tay");
        this.addQuestion(q6, TABLE_QUEST5);
        Question q7 = new Question("Tay cầm cục thịt nắn nắn, tay vỗ mông là đang làm gì?", "Cho con bú", "Đấu vật ", "Thái thịt", "Cho con bú");
        this.addQuestion(q7, TABLE_QUEST5);
        Question q8 = new Question("Có 1 đàn chim đậu trên cành, người thợ săn bắn cái rằm. Hỏi chết mấy con?", "14", "15", "16", "15");
        this.addQuestion(q8, TABLE_QUEST5);
        Question q9 = new Question("Ở Việt Nam có 5% số người sử dụng điện thoại không có tên trong danh bạ điện thoại. Nếu ta lấy ngẫu nhiên 100 người trong danh bạ thì trung bình sẽ có bao nhiêu người không có số điện thoại.?", "0%", "5%", "10%", "0%");
        this.addQuestion(q9, TABLE_QUEST5);
        Question q10 = new Question("Trên lông, dưới lông đến khi vui sướng nó chồng lên nhau?", "Mi mắt", "Đôi môi", "Đôi tay", "Mi mắt");
        this.addQuestion(q10, TABLE_QUEST5);
    }

    private void addQuestion6() {
        Question q1 = new Question("Một người đá một quả bóng ra xa 6m. Nhưng bỗng nhiên quả bóng quay lại vs người đá. biết quả bóng không hề trúng một vật cản nào, Nguyên nhân là gì?", "Điều này hư cấu, không thể xảy ra được", "Chuyện này bình thường và cần có kỹ năng", "Hẳn người đá đã sử dụng một tiểu xảo nào đó để khiến cho quả bóng sau khi đá xong quay trở lại chỗ mình. ", "Chuyện này bình thường và cần có kỹ năng");
        this.addQuestion(q1, TABLE_QUEST6);
        Question q2 = new Question("Một cô gái cầm trên tay 12 trái bắp và nói đó là tên của cô ấy, hỏi cô ấy tên gì?", "Nga", "Ngô", "Hà", "Nga");
        this.addQuestion(q2, TABLE_QUEST6);
        Question q3 = new Question("Hai người đào trong 2 giờ thì được một cái hố, hỏi 1 người đào trong 1h được mấy cái hố?", "Nửa cái hố", "Một cái hố", "Hai cái hố", "Một cái hố");
        this.addQuestion(q3, TABLE_QUEST6);
        Question q4 = new Question(" Con ma đỏ đập 2 phát chết, con ma xanh đập 1 phát chết. Hỏi làm sao trong 2 lần đập chết cả hai con?", "Đập ma đỏ trước", "Đập ma xanh trước", "Không thể được", "Đập ma xanh trước");
        this.addQuestion(q4, TABLE_QUEST6);
        Question q5 = new Question(" Những loài thú nào sau đây ăn cơm?", "Sư tử", "Cọp", "Hà mã", "Sư tử");
        this.addQuestion(q5, TABLE_QUEST6);
        Question q6 = new Question("Con gấu trúc ao ước gì mà không bao giờ được?", "Ăn kẹo", "Đá bóng", "Chụp hình", "Chụp hình");
        this.addQuestion(q6, TABLE_QUEST6);
        Question q7 = new Question("Loài vật nào sau đây có thể thở bằng mông?", "Kangaroo", "Rùa", "Cá mập", "Rùa");
        this.addQuestion(q7, TABLE_QUEST6);
        Question q8 = new Question("Loài chim nào có khả năng bay ngược?", "chim én", "chim ruồi", "chim hải âu", "chim ruồi");
        this.addQuestion(q8, TABLE_QUEST6);
        Question q9 = new Question("Ai  ?", "phan đình giót", "tố hữu", "Bác Hồ", "phan đình giót");
        this.addQuestion(q9, TABLE_QUEST6);
        Question q10 = new Question("Ai  ?", "phan đình giót", "tố hữu", "Bác Hồ", "phan đình giót");
        this.addQuestion(q10, TABLE_QUEST6);
    }

    private void addQuestion7() {
        Question q1 = new Question("Có một tàu điện đi về hướng nam. Gió hướng tây bắc. Vậy khói từ con tàu sẽ theo hướng nào? ?", "Tây", "Bắc", "Không hướng nào", "Không hướng nào");
        this.addQuestion(q1, TABLE_QUEST7);
        Question q2 = new Question("Làm thế nào để không đụng phải ngón tay khi bạn đập búa vào một cái móng tay?", "Tay trái", "Tay phải", "Cả hai tay", "Cả hai tay");
        this.addQuestion(q2, TABLE_QUEST7);
        Question q3 = new Question("Nếu bạn nhìn thấy con chim đang đậu trên nhánh cây, làm sao để lấy nhánh cây mà không làm động con chim?", "Cứ đến mà lấy", "Đợi chim bay đi", "Ru chim ngủ rồi lấy", "Đợi chim bay đi");
        this.addQuestion(q3, TABLE_QUEST7);
        Question q4 = new Question("Miệng rộng lớn nhưng không nói một từ, là con gì? ", "Con sông", "Con sâu", "Con voi", "Con sông");
        this.addQuestion(q4, TABLE_QUEST7);
        Question q5 = new Question("Có bao nhiêu chữ C trong câu sau: \"Cơm, canh, cá, tất cả em đều thích\"?", "1", "2", "3", "1");
        this.addQuestion(q5, TABLE_QUEST7);
        Question q6 = new Question("Cái gì bạn không mượn mà trả?", "Lời cảm ơn", "Tình", "Không thứ gì cả", "Lời cảm ơn");
        this.addQuestion(q6, TABLE_QUEST7);
        Question q7 = new Question("Cái gì luôn đi đến mà không bao giờ đến nơi?", "Cơn gió", "Tình yêu", "Ngày mai", "Ngày mai");
        this.addQuestion(q7, TABLE_QUEST7);
        Question q8 = new Question("8 chia 4 = ?", "4/3", "5/3", "2", "4/3");
        this.addQuestion(q8, TABLE_QUEST7);
        Question q9 = new Question("Có 2 người cha và 2 người con cùng chia đều số tiền là 27 nghìn. Hỏi mỗi người được bao nhiều?", "6.75", "7", "9", "9");
        this.addQuestion(q9, TABLE_QUEST7);
        Question q10 = new Question("Có 1 đàn chuột điếc đi ngang qua hố cống, hỏi có mấy con?", "12", "24", "36", "24");
        this.addQuestion(q10, TABLE_QUEST7);
        Question q11 = new Question("Cái gì mà đi thì nằm, đứng cũng nằm, nhưng nằm lại đứng?", "Cái bàn", "Bàn chân", "Bàn tay", "Bàn chân");
        this.addQuestion(q11, TABLE_QUEST7);
        Question q12 = new Question("Một kẻ giết người bị kết án tử hình. Hắn ta phải chọn một trong ba căn phòng: phòng thứ nhất lửa cháy dữ dội, phòng thứ hai đầy sư tử nhịn đói trong ba năm. Phòng nào an toàn nhất cho hắn?", "1", "2", "Không phòng nào", "2");
        this.addQuestion(q12, TABLE_QUEST7);
        Question q13 = new Question("Chồng người da đen, vợ người da trắng vừa sinh một đứa bé, răng của nó màu gì?", "Đen", "Trắng", "Vàng", "Trắng");
        this.addQuestion(q13, TABLE_QUEST7);
        Question q14 = new Question("Có 1 đàn chuột điếc đi ngang qua hố cống, hỏi có mấy con?", "12", "24", "36", "24");
        this.addQuestion(q14, TABLE_QUEST7);
        Question q15 = new Question("Có 1 đàn chuột điếc đi ngang qua hố cống, hỏi có mấy con?", "12", "24", "36", "24");
        this.addQuestion(q15, TABLE_QUEST7);
    }

    private void addQuestion8() {
        HighScore h1 = new HighScore("Khoa Học Xã hội", "0");
        this.addTheLoai(h1, TABLE_QUEST8);
        HighScore h2 = new HighScore("Toán Học", "0");
        this.addTheLoai(h2, TABLE_QUEST8);
        HighScore h3 = new HighScore("Văn Học - Lịch Sử", "0");
        this.addTheLoai(h3, TABLE_QUEST8);
        HighScore h4 = new HighScore("Địa Lý", "0");
        this.addTheLoai(h4, TABLE_QUEST8);
        HighScore h5 = new HighScore("Câu Đố Mẹo", "0");
        this.addTheLoai(h5, TABLE_QUEST8);
        HighScore h6 = new HighScore("Câu Đố Vui", "0");
        this.addTheLoai(h6, TABLE_QUEST8);
        HighScore h7 = new HighScore("Câu Đố Hay", "0");
        this.addTheLoai(h7, TABLE_QUEST8);
        HighScore h8 = new HighScore("Câu Đố Cười", "0");
        this.addTheLoai(h8, TABLE_QUEST8);


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        //Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST2);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST3);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST4);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST5);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST6);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST7);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST8);

        //Create tables again
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(Question quest, String x) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());

        // Inserting Row
        dbase.insert(x, null, values);
    }

    // Adding the loai
    public void addTheLoai(HighScore highScore, String x) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        //values.put(KEY_ID, highScore.getIDHS());
        values.put(KEY_LOAI, highScore.getTheloai());
        values.put(KEY_HIGH, highScore.getDiem());


        // Inserting Row
        dbase.insert(x, null, values);
    }

    public List<Question> getAllQuestions0() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        Query(selectQuery, quesList);
        return quesList;
    }

    public List<Question> getAllQuestions1() {
        List<Question> quesList1 = new ArrayList<Question>();
        // Select All Query
        String selectQuery1 = "SELECT  * FROM " + TABLE_QUEST1;
        Query(selectQuery1, quesList1);
        return quesList1;
    }

    public List<Question> getAllQuestions2() {
        List<Question> quesList2 = new ArrayList<Question>();
        // Select All Query
        String selectQuery2 = "SELECT  * FROM " + TABLE_QUEST2;
        Query(selectQuery2, quesList2);
        return quesList2;
    }

    public List<Question> getAllQuestions3() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST3;
        Query(selectQuery, quesList);
        return quesList;
    }

    public List<Question> getAllQuestions4() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST4;
        Query(selectQuery, quesList);
        return quesList;
    }

    public List<Question> getAllQuestions5() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST5;
        Query(selectQuery, quesList);
        return quesList;
    }

    public List<Question> getAllQuestions6() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST6;
        Query(selectQuery, quesList);
        return quesList;
    }

    public List<Question> getAllQuestions7() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST7;
        Query(selectQuery, quesList);
        return quesList;
    }

    private void Query(String x, List<Question> quesList) {

        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(x, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
    }

    public List<HighScore> getHighScore() {
        List<HighScore> highScores = new ArrayList<HighScore>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST8;
        QueryHighScore(selectQuery, highScores);
        return highScores;
    }

    private void QueryHighScore(String x, List<HighScore> highScores) {

        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(x, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                HighScore highScore = new HighScore();
                //highScore.setIDHS(cursor.getInt(0));
                highScore.setTheloai(cursor.getString(1));
                highScore.setDiem(cursor.getString(2));

//				highScore.setTheloai(cursor.getString(2));
//				highScore.setDiem(cursor.getInt(3));
//
//				highScore.setTheloai(cursor.getString(4));
//				highScore.setDiem(cursor.getInt(5));
//
//				highScore.setTheloai(cursor.getString(6));
//				highScore.setDiem(cursor.getInt(7));

                highScores.add(highScore);
            } while (cursor.moveToNext());
        }
    }


    public void addScore(Question question) {
        ContentValues values = new ContentValues();
        values.put(KEY_OPTD, question.getSCORE1());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getData() {
        List<Question> list = new ArrayList<>();
        Question question = null;
        String select = "select *from " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(select, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                //quest.setSCORE1(cursor.getString(6));
                list.add(quest);
            } while (cursor.moveToNext());
        }
        return list;
    }
}