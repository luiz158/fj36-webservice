package br.com.caelum.estoque.saaj;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class TestaSAAJ {

	public static void main(String[] args) throws SOAPException, IOException {
		MessageFactory factory = MessageFactory.newInstance();
		
		SOAPMessage message = factory.createMessage();
		
		SOAPBody body = message.getSOAPBody();
		
		body.addBodyElement(new QName("http://ws.estoque.caelum.com.br/", "getQuantidade", "ns2"));
		
		body.addChildElement(new QName("codigo")).setValue("2");
		
		message.writeTo(System.out);
	}
	
}
