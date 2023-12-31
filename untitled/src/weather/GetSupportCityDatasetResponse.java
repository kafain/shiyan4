/**
 * GetSupportCityDatasetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weather;

public class GetSupportCityDatasetResponse  implements java.io.Serializable {
    private weather.GetSupportCityDatasetResponseGetSupportCityDatasetResult getSupportCityDatasetResult;

    public GetSupportCityDatasetResponse() {
    }

    public GetSupportCityDatasetResponse(
           weather.GetSupportCityDatasetResponseGetSupportCityDatasetResult getSupportCityDatasetResult) {
           this.getSupportCityDatasetResult = getSupportCityDatasetResult;
    }


    /**
     * Gets the getSupportCityDatasetResult value for this GetSupportCityDatasetResponse.
     * 
     * @return getSupportCityDatasetResult
     */
    public weather.GetSupportCityDatasetResponseGetSupportCityDatasetResult getGetSupportCityDatasetResult() {
        return getSupportCityDatasetResult;
    }


    /**
     * Sets the getSupportCityDatasetResult value for this GetSupportCityDatasetResponse.
     * 
     * @param getSupportCityDatasetResult
     */
    public void setGetSupportCityDatasetResult(weather.GetSupportCityDatasetResponseGetSupportCityDatasetResult getSupportCityDatasetResult) {
        this.getSupportCityDatasetResult = getSupportCityDatasetResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSupportCityDatasetResponse)) return false;
        GetSupportCityDatasetResponse other = (GetSupportCityDatasetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSupportCityDatasetResult==null && other.getGetSupportCityDatasetResult()==null) || 
             (this.getSupportCityDatasetResult!=null &&
              this.getSupportCityDatasetResult.equals(other.getGetSupportCityDatasetResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetSupportCityDatasetResult() != null) {
            _hashCode += getGetSupportCityDatasetResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSupportCityDatasetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getSupportCityDatasetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSupportCityDatasetResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getSupportCityDatasetResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">>getSupportCityDatasetResponse>getSupportCityDatasetResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
