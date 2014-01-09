package be.vdab.rest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// enkele imports
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "filialen")
public class FiliaalListREST {
	
 @XmlElement(name="filiaal")
 private final List<FiliaalListItemREST> filialen = new ArrayList<>();
 private Link link;

 public List<FiliaalListItemREST> getFilialen() {
	return filialen;
 }

 public Link getLink() {
	return link;
 }


}