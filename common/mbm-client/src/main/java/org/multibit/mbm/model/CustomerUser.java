package org.multibit.mbm.model;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * <p>DTO to provide the following to Resources:</p>
 * <ul>
 * <li>Provision of state for a single User as viewed by the Customer</li>
 * </ul>
 *
 * @since 0.0.1
 *         
 */
public class CustomerUser {

  private String sku;
  private String gtin;

  private Map<String,String> optionalProperties= Maps.newHashMap();

  /**
   * <p>The <a href="http://en.wikipedia.org/wiki/Stock-keeping_unit">stock-keeping unit</a></p>
   *
   * @return Provides a mandatory code to identify an item using a local arbitrary structure, e.g. "ABC-123". The GTIN
   *         value could be replicated here if appropriate (such as for a bookstore)
   */
  public String getSKU() {
    return sku;
  }

  public void setSKU(String sku) {
    this.sku = sku;
  }

  /**
   * <p>The <a href="http://en.wikipedia.org/wiki/Global_Trade_Item_Number">global trade item number</a></p>
   *
   * @return Provides the optional GTIN code to identify an item using international standards such as UPC, EAN and IAN.
   *         In the case of books, ISBN is compatible with the EAN-13 standard.
   */
  public String getGTIN() {
    return gtin;
  }

  public void setGTIN(String gtin) {
    this.gtin = gtin;
  }

  /**
   * @return A collection of optional properties for display. See the API reference for keys.
   */
  public Map<String, String> getOptionalProperties() {
    return optionalProperties;
  }

  public void setOptionalProperties(Map<String, String> optionalProperties) {
    this.optionalProperties = optionalProperties;
  }
}
