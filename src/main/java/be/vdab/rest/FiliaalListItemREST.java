package be.vdab.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
public class FiliaalListItemREST {
 @XmlAttribute
 private long id;
 @XmlAttribute
 private String naam;
 private Link link;

 public long getId() {
	return id;
 }
 
 public String getNaam() {
	return naam;
 }
 
 public Link getLink() {
	return link;
 }


}