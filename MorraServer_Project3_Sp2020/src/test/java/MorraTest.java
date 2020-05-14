import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MorraTest
{
	MorraInfo mora;

	@BeforeEach
	void init()
	{
		mora = new MorraInfo();
	}

	@Test
	void test11()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test33()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test34()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 0;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test36()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 1;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test38()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 0;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test50()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 0;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test56()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 0;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test61()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test75()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test76()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 0;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test83()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test85()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test86()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 0;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test117()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test121()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 3;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test133()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test135()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test138()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test149()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test159()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test173()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test192()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test205()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test222()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test234()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test235()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test241()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test244()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 0;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test253()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test256()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test260()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test262()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test274()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test275()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test279()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test280()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test282()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test291()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test307()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 0;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test314()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 0;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test317()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test323()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test329()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test330()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test341()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 0;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test354()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test366()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 0;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test369()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test386()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 0;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test387()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 0;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test417()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test422()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test426()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test431()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test435()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test437()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test446()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test449()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test451()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test462()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test465()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test471()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test476()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test477()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test480()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test491()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test492()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test495()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test500()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test505()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 3;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test506()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test508()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test511()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test529()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test531()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test539()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test553()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test568()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test571()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test580()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test584()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test585()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test599()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test607()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test610()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test616()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test620()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test627()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test644()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test654()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 7;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test664()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test686()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test690()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 8;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test707()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 8;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test709()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test723()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 1;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test731()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 1;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test748()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test750()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test751()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test757()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test758()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test762()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test768()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test772()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test775()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test776()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test782()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 1;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test805()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 2;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test810()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test817()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 2;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test827()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test832()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 2;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test840()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 1;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test862()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 2;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test865()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 2;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test868()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 2;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test869()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test891()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 2;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test900()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test907()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 2;
		mora.p2Guess = 3;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test914()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test920()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test921()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 2;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test928()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 2;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test931()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 2;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test952()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 2;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test958()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 2;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test969()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 2;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test972()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test974()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test977()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test992()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test996()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test998()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test999()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1002()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1022()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1037()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1042()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 2;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1044()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1053()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 2;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1055()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1061()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1070()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1080()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1085()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1093()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 2;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1104()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1109()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1116()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 2;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1118()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 9;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1124()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1142()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 2;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1143()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 2;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1149()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 2;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1163()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1181()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 2;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1188()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 0;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1193()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 3;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1198()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1200()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1208()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 3;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1209()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1255()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1258()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1267()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 2;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1273()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 2;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1280()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 3;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1281()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1284()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1299()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(3, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1300()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1301()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1307()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1323()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1326()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1329()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1330()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1335()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 4;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1341()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 4;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1342()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1362()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1365()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1372()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1378()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1382()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1383()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1387()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1392()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1400()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1401()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1404()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1423()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1438()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1451()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 3;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1463()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 3;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1465()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1466()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 3;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1470()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1474()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1485()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1486()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1502()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 3;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1503()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1531()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1542()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1545()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1551()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 3;
		mora.p2Guess = 10;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1552()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 3;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1555()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1560()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 3;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1562()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 3;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1567()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 3;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1583()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 3;
		mora.p2Guess = 10;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1584()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1586()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1587()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1592()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1593()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1595()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1598()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1599()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1608()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1611()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1618()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1620()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1624()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 1;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1634()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 1;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1655()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 4;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1677()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1697()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 4;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1711()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 4;
		mora.p2Guess = 3;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1736()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1740()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1741()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 4;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1756()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1766()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1776()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1778()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1783()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1784()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1792()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1793()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1794()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1796()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1808()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1822()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1830()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1851()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1855()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 4;
		mora.p2Guess = 7;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1861()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 4;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1864()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1868()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1872()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1881()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 8;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1899()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1902()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1904()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1918()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1926()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1937()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 4;
		mora.p2Guess = 9;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1947()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 4;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1954()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1960()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 4;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1974()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 4;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test1976()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 4;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2013()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 5;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2026()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 1;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2028()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 5;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2032()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2035()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2039()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 5;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2047()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2056()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2060()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2062()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 2;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2079()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 5;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2080()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2082()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 5;
		mora.p2Guess = 2;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2097()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 5;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2099()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 5;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2102()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2104()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2105()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 5;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2109()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 5;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2125()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2136()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 5;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2144()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 4;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2152()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2163()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 5;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2183()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 5;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2197()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2204()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2206()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 6;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2219()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 5;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2231()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 5;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2232()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2240()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2242()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2245()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2248()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2249()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2262()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2263()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2269()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2276()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2277()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 5;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2282()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2290()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2304()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 5;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2305()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2340()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 5;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2343()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 5;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2344()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2356()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 5;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2365()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 5;
		mora.p2Guess = 10;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2366()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 5;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2380()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 6;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2387()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 0;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2388()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2397()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 0;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2400()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2402()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 0;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2422()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 6;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2426()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2440()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 6;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2450()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2452()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2454()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2456()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2472()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2478()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2481()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2482()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 6;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2486()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2495()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 3;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2507()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2511()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2515()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 6;
		mora.p2Guess = 3;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2520()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2523()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2556()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2557()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 6;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2562()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2582()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 5;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2583()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2588()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2593()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2595()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2600()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2601()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2602()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2603()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(3, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2604()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2612()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2616()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2618()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(3, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2619()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2622()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2658()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2661()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2663()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2691()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 6;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2693()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2705()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2713()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 6;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2714()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 6;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2730()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 6;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2753()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 6;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2774()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2783()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2800()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 7;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2802()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2814()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 1;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2816()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2823()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 7;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2825()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 1;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2849()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2864()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2866()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 7;
		mora.p2Guess = 2;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2869()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 7;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2870()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2871()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 7;
		mora.p2Guess = 2;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2875()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 7;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2880()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2884()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 7;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2893()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 7;
		mora.p2Guess = 3;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2894()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2904()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2924()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2925()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 7;
		mora.p2Guess = 4;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2939()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2941()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 7;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2956()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 7;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2963()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2964()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test2995()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 7;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3000()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3002()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3011()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3021()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 7;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3023()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3031()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 7;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3054()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3074()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3095()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 7;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3108()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3116()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 7;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3117()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 7;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3126()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 7;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3163()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 7;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3181()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 8;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3222()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 8;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3241()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 8;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3244()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3250()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3256()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3267()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 8;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3317()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 8;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3318()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 8;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3322()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3328()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3346()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3353()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 8;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3358()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3360()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 8;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3386()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 8;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3394()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3414()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 8;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3417()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 8;
		mora.p2Guess = 6;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3422()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 8;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3426()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 8;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3429()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 8;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3432()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 8;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3438()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 8;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3452()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 8;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3459()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 8;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3465()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 8;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3469()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 8;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3475()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 8;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3477()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 8;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3484()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 8;
		mora.p2Guess = 8;

		assertEquals(3, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3545()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 8;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3557()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 8;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3559()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 8;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3579()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3583()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3590()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3604()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3609()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3614()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3631()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3637()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3643()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 2;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3650()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3658()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3662()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3670()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 2;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3676()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3678()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3682()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3684()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3686()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3688()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3691()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3692()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3696()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3699()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3706()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 3;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3722()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 4;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3739()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3747()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3750()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3751()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3752()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3759()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3760()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3766()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3775()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3780()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3781()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3790()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3791()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 9;
		mora.p2Guess = 6;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3793()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3797()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 9;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3819()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3822()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3833()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 9;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3840()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3857()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3860()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3864()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3866()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3871()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3874()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3875()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3886()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 8;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3897()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3899()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 9;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3918()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3931()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3949()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3953()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 9;
		mora.p2Guess = 10;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3954()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 9;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3955()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 9;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3957()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 9;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3958()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 9;
		mora.p2Guess = 10;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3974()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 10;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3984()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test3987()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 10;
		mora.p2Guess = 0;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4013()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 10;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4024()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 10;
		mora.p2Guess = 1;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4033()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 10;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4054()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 10;
		mora.p2Guess = 2;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4075()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 10;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4082()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 10;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4086()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 3;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4101()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 10;
		mora.p2Guess = 3;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4117()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 10;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4118()
	{
		mora.p1PlayFingers = 2;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 10;
		mora.p2Guess = 4;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4134()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 4;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4139()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 10;
		mora.p2Guess = 4;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4163()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 10;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4164()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 5;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4165()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 10;
		mora.p2Guess = 5;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4175()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 10;
		mora.p2Guess = 5;

		assertEquals(1, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4186()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 10;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4203()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 10;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4208()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 10;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4210()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 10;
		mora.p2Guess = 6;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4216()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 10;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4218()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4222()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 10;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4236()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 7;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4244()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 10;
		mora.p2Guess = 7;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4258()
	{
		mora.p1PlayFingers = 1;
		mora.p2PlayFingers = 4;
		mora.p1Guess = 10;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4278()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4280()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 10;
		mora.p2Guess = 8;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4287()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 10;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4302()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4305()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 3;
		mora.p1Guess = 10;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4309()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 10;
		mora.p2Guess = 9;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4313()
	{
		mora.p1PlayFingers = 4;
		mora.p2PlayFingers = 5;
		mora.p1Guess = 10;
		mora.p2Guess = 9;

		assertEquals(2, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4320()
	{
		mora.p1PlayFingers = 0;
		mora.p2PlayFingers = 0;
		mora.p1Guess = 10;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4339()
	{
		mora.p1PlayFingers = 3;
		mora.p2PlayFingers = 1;
		mora.p1Guess = 10;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}

	@Test
	void test4352()
	{
		mora.p1PlayFingers = 5;
		mora.p2PlayFingers = 2;
		mora.p1Guess = 10;
		mora.p2Guess = 10;

		assertEquals(4, mora.evalWin(mora.p1PlayFingers, mora.p2PlayFingers));
	}
}