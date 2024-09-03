package pl.dom.orm;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.oxm.Marshaller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import pl.dom.orm.repo.OsobaDAO;
import pl.dom.orm.repo.OsobaHbm;
import pl.dom.orm.repo.ProduktMarshaling;

@SpringBootApplication
@ImportResource("hiberTest.xml")
public class OrmApplication {
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ConfigurableApplicationContext ctx  = SpringApplication.run(OrmApplication.class, args);
		OsobaDAO osobaDao = ctx.getBean("osobaDao", OsobaDAO.class);
		System.out.println("TEST " + osobaDao);
		
		System.out.println(osobaDao.getOsobyByName("Adrian1"));
		
//		pl.dom.orm.repo.OsobaHbm nowa = new pl.dom.orm.repo.OsobaHbm();
//		nowa.setId(9998);
//		nowa.setImie("Joanna");
//		nowa.setNazwisko("Burakowaska");
//		nowa.setNumer(123345);
//		osobaDao.save(nowa);
		
//		ProduktMarshalingClass marsh = ctx.getBean("produktMarshalingClass", ProduktMarshalingClass.class);
//		marsh.saveProdukt();
//		System.out.println("ZAPISANE !!");
//		marsh.loadProdukt();
		
//		Marshaller marsh = (Marshaller) ctx.getBean("xstreamMarshaller");
//		ProduktMarshaling produkt = new ProduktMarshaling();
//		produkt.setImie("Anna");
//		produkt.setNumber(45L);
//		produkt.setOld(true);
//		marsh.marshal(produkt, new StreamResult(new FileWriter("produkt.xml")));
		
	}


	
}
