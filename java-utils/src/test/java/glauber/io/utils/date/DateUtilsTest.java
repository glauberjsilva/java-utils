package glauber.io.utils.date;

import static org.junit.Assert.assertFalse;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void deveSerMesmaData() {
		Date dataAgora = new Date();
		Date mesmaData = DateUtils.obterDataComDiferencaDias(0);
				
		Assert.assertTrue(DateUtils.isMesmaData(dataAgora, mesmaData));

	}
	
	@Test
	public void deveSerDatasDiferentes() {
		Date dataAgora = new Date();
		Date dataFutura = DateUtils.obterDataComDiferencaDias(1);
		
		assertFalse(DateUtils.isMesmaData(dataAgora, dataFutura));
	}
}
