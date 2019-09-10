package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerBalanceTransactionCollectionCreateParams;
import com.stripe.param.CustomerBalanceTransactionCollectionListParams;
import com.stripe.param.CustomerBalanceTransactionCollectionRetrieveParams;
import java.util.Map;

public class CustomerBalanceTransactionCollection
  extends StripeCollection<CustomerBalanceTransaction> {
  /**
   * <p>Retrieves a specific transaction that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves a specific transaction that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction retrieve(
      String id,
      RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves a specific transaction that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction retrieve(
      String id,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      CustomerBalanceTransaction.class,
      options
    );
  }

  /**
   * <p>Retrieves a specific transaction that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction retrieve(
      String id,
      CustomerBalanceTransactionCollectionRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      CustomerBalanceTransaction.class,
      options
    );
  }

  /**
   * <p>Returns a list of transactions that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransactionCollection list(
      Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of transactions that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransactionCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(
      url,
      params,
      CustomerBalanceTransactionCollection.class,
      options
    );
  }

  /**
   * <p>Returns a list of transactions that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransactionCollection list(
      CustomerBalanceTransactionCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of transactions that updated the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransactionCollection list(
      CustomerBalanceTransactionCollectionListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(
      url,
      params,
      CustomerBalanceTransactionCollection.class,
      options
    );
  }

  /**
   * <p>Creates an immutable transaction that updates the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates an immutable transaction that updates the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      CustomerBalanceTransaction.class,
      options
    );
  }

  /**
   * <p>Creates an immutable transaction that updates the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction create(
      CustomerBalanceTransactionCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates an immutable transaction that updates the customer’s <a href="/docs/api/customers/object#customer_object-balance"><code>balance</code></a>.</p>
   */
  public CustomerBalanceTransaction create(
      CustomerBalanceTransactionCollectionCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      CustomerBalanceTransaction.class,
      options
    );
  }
}