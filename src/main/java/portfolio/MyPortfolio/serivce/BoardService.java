package portfolio.MyPortfolio.serivce;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import portfolio.MyPortfolio.repository.BoardRepository;

@Service
@AllArgsConstructor

public class BoardService {
    private BoardRepository boardRepository;

    //DTO 생성
}
