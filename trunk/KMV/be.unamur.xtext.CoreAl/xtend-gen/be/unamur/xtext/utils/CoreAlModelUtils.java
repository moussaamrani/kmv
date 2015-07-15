package be.unamur.xtext.utils;

import be.unamur.xtext.coreAl.Attribute;
import be.unamur.xtext.coreAl.Feature;
import be.unamur.xtext.coreAl.Operation;
import be.unamur.xtext.coreAl.Reference;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class CoreAlModelUtils {
  public static Iterable<Attribute> attributes(final be.unamur.xtext.coreAl.Class c) {
    EList<Feature> _features = c.getFeatures();
    return Iterables.<Attribute>filter(_features, Attribute.class);
  }
  
  public static Iterable<Reference> references(final be.unamur.xtext.coreAl.Class c) {
    EList<Feature> _features = c.getFeatures();
    return Iterables.<Reference>filter(_features, Reference.class);
  }
  
  public static Iterable<Operation> opeations(final be.unamur.xtext.coreAl.Class c) {
    EList<Feature> _features = c.getFeatures();
    return Iterables.<Operation>filter(_features, Operation.class);
  }
}
