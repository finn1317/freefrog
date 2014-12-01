package com.couragelabs.freefrog;

import org.pcollections.HashTreePSet;
import org.pcollections.PSet;

import static java.lang.String.format;

/**
 * This is a Holacracy Role.
 */
public class Role {
  private final String purpose;
  private final PSet<String> domains;

  public Role() {
    this(null, null);
  }

  Role(String purpose, PSet<String> domains) {
    this.purpose = purpose;
    this.domains = domains == null ? HashTreePSet.<String>empty() : domains;
  }

  public String getPurpose() {
    return purpose;
  }

  /**
   * @return a new Role with the purpose changed to the given one
   */
  public Role updatePurpose(String purpose) {
    return new Role(purpose, domains);
  }

  public PSet<String> getDomains() {
    return domains;
  }

  /**
   * @return a new Role with the given domain added
   */
  public Role addDomain(String domain) {
    if (domains.contains(domain)) {
      throw new IllegalStateException(format("Domain '%s' already exists.",
          domain));
    }
    return new Role(purpose, domains.plus(domain));
  }

  /**
   * @return a new Role with the given domain removed
   */
  public Role removeDomain(String domain) {
    return new Role(purpose, domains.minus(domain));
  }
}
