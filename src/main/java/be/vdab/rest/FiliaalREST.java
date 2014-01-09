package be.vdab.rest;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.BeanUtils;

@XmlRootElement(name = "filiaal")
public class FiliaalREST extends Filiaal {
 private Link link;


 public Link getLink() {
	return link;
 }


 public void setLink(Link link) {
	this.link = link;
 }


 public Filiaal toFiliaal() {
  // geeft een Filiaal object terug als kopie van het huidig object
   Filiaal filiaal = new Filiaal();
   BeanUtils.copyProperties(this, filiaal);
   return filiaal;
 }

}