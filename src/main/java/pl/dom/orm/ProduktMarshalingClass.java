package pl.dom.orm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import pl.dom.orm.repo.ProduktMarshaling;

public class ProduktMarshalingClass {
//
//		private ProduktMarshaling produkt = new ProduktMarshaling();
//		private ProduktMarshaling produktZPliku = new ProduktMarshaling();
////		private Marshaller marshaller;
////		private Unmarshaller unmarshaller;
//		
//		
//		public ProduktMarshalingClass() {
//			produkt.setImie("Anna");
//			produkt.setNumber(45L);
//			produkt.setOld(true);
//		}
//		
//		public void saveProdukt() throws FileNotFoundException, IOException {
//			try(FileOutputStream os = new FileOutputStream("produkt.xml")){
//				marshaller.marshal(produkt, new StreamResult(os));
//			}
//		}
//		
//		public void loadProdukt() throws FileNotFoundException, IOException {
//			try(FileInputStream is = new FileInputStream("produkt.xml")){
//				produktZPliku = (ProduktMarshaling)unmarshaller.unmarshal(new StreamSource(is));
//			}
//			System.out.println("produkt z pliku " + produktZPliku.getImie() + " " + produktZPliku.getNumber() + " " + produktZPliku.isOld());
//		}
//		
//		public void setMarshaller(Marshaller marshaller) {
//			  this.marshaller = marshaller;
//		}
//		public void setUnmarshaller(Unmarshaller unmarshaller) {
//			  this.unmarshaller = unmarshaller;
//		}
//
//		public Unmarshaller getUnmarshaller() {
//			return unmarshaller;
//		}
//
//		public Marshaller getMarshaller() {
//			return marshaller;
//		}
//
//		
//		
}
