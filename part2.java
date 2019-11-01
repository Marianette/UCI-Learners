
// Generated with Weka 3.8.3
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Mon Jul 29 23:23:50 NZST 2019

package weka.classifiers;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;

public class WekaWrapper
  extends AbstractClassifier {

  /**
   * Returns only the toString() method.
   *
   * @return a string describing the classifier
   */
  public String globalInfo() {
    return toString();
  }

  /**
   * Returns the capabilities of this classifier.
   *
   * @return the capabilities
   */
  public Capabilities getCapabilities() {
    weka.core.Capabilities result = new weka.core.Capabilities(this);

    result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
    result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
    result.enable(weka.core.Capabilities.Capability.NUMERIC_CLASS);
    result.enable(weka.core.Capabilities.Capability.DATE_CLASS);
    result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);


    result.setMinimumNumberInstances(1);

    return result;
  }

  /**
   * only checks the data against its capabilities.
   *
   * @param i the training data
   */
  public void buildClassifier(Instances i) throws Exception {
    // can classifier handle the data?
    getCapabilities().testWithFail(i);
  }

  /**
   * Classifies the given instance.
   *
   * @param i the instance to classify
   * @return the classification result
   */
  public double classifyInstance(Instance i) throws Exception {
    Object[] s = new Object[i.numAttributes()];
    
    for (int j = 0; j < s.length; j++) {
      if (!i.isMissing(j)) {
        if (i.attribute(j).isNominal())
          s[j] = new String(i.stringValue(j));
        else if (i.attribute(j).isNumeric())
          s[j] = new Double(i.value(j));
      }
    }
    
    // set class value to missing
    s[i.classIndex()] = null;
    
    return WekaClassifier.classify(s);
  }

  /**
   * Returns the revision string.
   * 
   * @return        the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("1.0");
  }

  /**
   * Returns only the classnames and what classifier it is based on.
   *
   * @return a short description
   */
  public String toString() {
    return "Auto-generated classifier wrapper, based on weka.classifiers.trees.REPTree (generated with Weka 3.8.3).\n" + this.getClass().getName() + "/WekaClassifier";
  }

  /**
   * Runs the classfier from commandline.
   *
   * @param args the commandline arguments
   */
  public static void main(String args[]) {
    runClassifier(new WekaWrapper(), args);
  }
}

class WekaClassifier {

  public static double classify(Object [] i)
    throws Exception {

    double p = Double.NaN;
    p = WekaClassifier.N35547d3f0(i);
    return p;
  }
  static double N35547d3f0(Object []i) {
    double p = Double.NaN;
    /* chest pain */
    if (i[2] == null) {
      p = 0;
    } else if (i[2].equals("1")) {
      p = 0;
    } else if (i[2].equals("2")) {
      p = 0;
    } else if (i[2].equals("3")) {
      p = 0;
    } else if (i[2].equals("4")) {
    p = WekaClassifier.N13b9c4ed1(i);
    } 
    return p;
  }
  static double N13b9c4ed1(Object []i) {
    double p = Double.NaN;
    /* major vessels */
    if (i[11] == null) {
      p = 0;
    } else if (i[11].equals("0")) {
    p = WekaClassifier.N92561832(i);
    } else if (i[11].equals("1")) {
    p = WekaClassifier.N7114a5955(i);
    } else if (i[11].equals("2")) {
      p = 3;
    } else if (i[11].equals("3")) {
      p = 4;
    } 
    return p;
  }
  static double N92561832(Object []i) {
    double p = Double.NaN;
    /* thallium defect */
    if (i[12] == null) {
      p = 0;
    } else if (i[12].equals("3")) {
      p = 0;
    } else if (i[12].equals("6")) {
      p = 0;
    } else if (i[12].equals("7")) {
    p = WekaClassifier.N3afcadbb3(i);
    } 
    return p;
  }
  static double N3afcadbb3(Object []i) {
    double p = Double.NaN;
    /* cholesterol */
    if (i[4] == null) {
      p = 1;
    } else if (((Double)i[4]).doubleValue() < 302.0) {
    p = WekaClassifier.N2c57825e4(i);
    } else if (true) {
      p = 2;
    } 
    return p;
  }
  static double N2c57825e4(Object []i) {
    double p = Double.NaN;
    /* max hr */
    if (i[7] == null) {
      p = 1;
    } else if (((Double)i[7]).doubleValue() < 133.0) {
      p = 3;
    } else if (true) {
      p = 1;
    } 
    return p;
  }
  static double N7114a5955(Object []i) {
    double p = Double.NaN;
    /* cholesterol */
    if (i[4] == null) {
      p = 1;
    } else if (((Double)i[4]).doubleValue() < 282.5) {
    p = WekaClassifier.N539ffb4d6(i);
    } else if (true) {
      p = 2;
    } 
    return p;
  }
  static double N539ffb4d6(Object []i) {
    double p = Double.NaN;
    /* age */
    if (i[0] == null) {
      p = 1;
    } else if (((Double)i[0]).doubleValue() < 60.5) {
    p = WekaClassifier.Nc5105f07(i);
    } else if (true) {
      p = 2;
    } 
    return p;
  }
  static double Nc5105f07(Object []i) {
    double p = Double.NaN;
    /* cholesterol */
    if (i[4] == null) {
      p = 1;
    } else if (((Double)i[4]).doubleValue() < 212.0) {
    p = WekaClassifier.N1c0423568(i);
    } else if (true) {
      p = 1;
    } 
    return p;
  }
  static double N1c0423568(Object []i) {
    double p = Double.NaN;
    /* thallium defect */
    if (i[12] == null) {
      p = 3;
    } else if (i[12].equals("3")) {
      p = 1;
    } else if (i[12].equals("6")) {
      p = 1;
    } else if (i[12].equals("7")) {
      p = 2;
    } 
    return p;
  }
}