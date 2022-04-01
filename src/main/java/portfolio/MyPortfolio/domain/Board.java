package portfolio.MyPortfolio.domain;


import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "board_id")
    private Long id; //pk
    private String title; //제목
    @OneToOne (fetch = FetchType.LAZY)
    private Like like; //좋아요
    @NotNull
    private String writer; //작성자

    private String content; // 내용

    @OneToMany(mappedBy = "boards")
    private List<Comment> commentList = new ArrayList<>();

    @Builder
    public Board(String title, String writer, String content){
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
