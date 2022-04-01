package portfolio.MyPortfolio.Repository;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import portfolio.MyPortfolio.domain.Board;
import portfolio.MyPortfolio.domain.Comment;
import portfolio.MyPortfolio.repository.BoardRepository;
import portfolio.MyPortfolio.repository.CommentRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CommentRepositoryTest {


   public void 댓글_조회(){
      Comment  comment1 = new  comment("내용A");
      Comment  comment2 = new  comment("내용A");
      BoardRepository.save(comment1);
      BoardRepository.save(comment2);

      //조회 검증
      List<comment> all = CommentRepository.findAll();
      assertThat(all.size()).isEqualTo(2);


      //삭제 검증
      CommentRepository.delete(comment1);
      CommentRepository.delete(comment2);

      long deletedCount= CommentRepository.count();
      assertThat(deletedCount).isEqualTo(0);
       //given

       //when

       //then





   }

}
