package be.vdab.rest;

import java.net.URI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
public class Link {
 @XmlAttribute
 private String rel;
 @XmlAttribute
 private URI href;
 
 public Link(String rel, URI href) {
  this.rel=rel;
  this.href=href;
 }
 
 protected Link() { // voor JAXB
 }
 
 public String getRel() {
	return rel;
 }
 
 public URI getHref() {
	return href;
 }

}
