package portfolio.MyPortfolio.Repository;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import portfolio.MyPortfolio.domain.Board;
import portfolio.MyPortfolio.repository.BoardRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;


    @Test
    public void 글_조회(){
        Board board1 = new Board("글A","정서영","내용A");
        Board board2 = new Board("글B","정서영2","내용B");
        BoardRepository.save(board1);
        BoardRepository.save(board2);

        //조회 검증
        List<Board> all = BoardRepository.findAll();
        assertThat(all.size()).isEqualTo(2);


        //삭제 검증
        BoardRepository.delete(board1);
        BoardRepository.delete(board2);

        long deletedCount= boardRepository.count();
        assertThat(deletedCount).isEqualTo(0);






        //given

        //when

        //then







    }

}
