package tetrisSpringJpa;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tetris.SpringJpa.config.JPAConfig;
import tetris.model.Piece;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={JPAConfig.class })
public class IDAOPieceTest {
	
		@Autowired(required=false)
		private IDAOPiece daoPiece ;
		
		
		@Test
		public void testQuery() {
			assertNotNull(daoPiece.findUnePiece("losange"));
		}
}
