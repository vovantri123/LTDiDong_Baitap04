package vn.iostar.baitap04;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Bai05RecycleViewActitivy extends AppCompatActivity {
    //khai báo
    private RecyclerView rvSongs;
    private SongAdapter mSongAdapter;
    private List<SongModel> mSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai05_recycleview);

        rvSongs = (RecyclerView) findViewById(R.id.rv_songs);

        // Create song data
        mSongs = new ArrayList<>();
        mSongs.add(new SongModel("60696","NEU EM CÒN TỔN TẠI","Khi anh bắt đầu 1 tinh yêu Là lúc anh tự thay","Trinh Đinh Quang"));
        mSongs.add(new SongModel( "60701","NGOC", "Co rat nhieu nhung cau chuyen Em dau rieng minh em biết", "Khac Viet"));
        mSongs.add(new SongModel( "68658","HAY TIN ANH LAN NUA", "Dau cho ta da sai khi o ben nhau Co yeu thương", "Thien Dong"));
        mSongs.add(new SongModel( "68618","CHUOI NGÀY VANG EM", "Từ khi em bước ra đi coi lòng anh ngập trang bao", "Duy Cuong"));
        mSongs.add(new SongModel( "68656","KHI NGƯỜI MINH YÊU KHOC", "Nưoc mat em dang roi tren những ngon tay Nước mat em", "Pham Mạnh Quỳnh"));
        mSongs.add(new SongModel( "68685","HỞ", "Anh mơ gặp em anh mơ được om anh mơ đuợc gan",  "Trinh Thang Binh"));
        mSongs.add(new SongModel( "60752","TINH YÊU CHẤP VA", "Muon đi xa noi yeu thương minh từng co Đe khong nghe","Mr. Siro"));
        mSongs.add(new SongModel( "68608","CHO NGAY MUA TAN", "1 ngày mưa va em khuất xa nơi anh bong dang cứ", "Trung Dức"));
        mSongs.add(new SongModel( "68603","CÂU HỎI EM CHƯA TRẢ LỜI", "Cần nơi em 1 lời giải thích thật lòng Dừng lặng im", "Yuki Huy Nam"));
        mSongs.add(new SongModel( "68728","QUA ĐI LẶNG LỄ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        mSongs.add(new SongModel( "60856","QUÊN ANH LÀ DIỂU EM KHÔNG THE - REMIX", "Cần thêm bao lâu để em quên đi niềm đâu Cần thêm", "Thien Ngon"));
        mSongAdapter = new SongAdapter( this, mSongs);


        rvSongs.setAdapter(mSongAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false); // Thử thay thành LinearLayoutManager.HORIZONTAL, kèm sửa file row_item_song.xml để custom item
        rvSongs.setLayoutManager(linearLayoutManager);


    }
}
