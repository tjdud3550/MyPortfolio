package portfolio.MyPortfolio.domain;

import lombok.Builder;

import javax.persistence.*;

@Entity

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="comment_id")
    @ManyToOne (fetch = FetchType.LAZY)
    private String writer; //댓글 작성자

    private String content; //댓글 내용

    private String date; //쓴 날짜 자동으로 가져오게 하고싶음

    @OneToOne (fetch = FetchType.LAZY)
    private Like like;
    @Builder
    public Comment( String writer, String content){

        this.content = content;
        this.writer = writer;
    }
}
