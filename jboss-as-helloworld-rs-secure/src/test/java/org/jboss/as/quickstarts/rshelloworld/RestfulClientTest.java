//package org.jboss.as.quickstarts.rshelloworld;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.arquillian.test.api.ArquillianResource;
//import org.jboss.service.MessageRestService;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.spec.WebArchive;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static org.junit.Assert.*;
//
//@RunWith(Arquillian.class)
//public class RestfulClientTest {
//
//	private static final String WEBAPP_SRC = "src/main/webapp";
//	/**
//	 * The name of the WAR Archive that will be used by Arquillian to deploy the
//	 * application.
//	 */
//	private static final String APP_NAME = "jboss-as-helloworld-rs-secure";
//	/**
//	 * The path of the endpoint in relation to the deployed web application.
//	 */
//	private static final String SERVICE_PATH = "/message";
//
//	@ArquillianResource
//	private URL deploymentUrl;
//
//	private MessageRestService client;
//
//	@Deployment(testable = false)
//	public static WebArchive createDeployment() {
//		return ShrinkWrap.create(WebArchive.class, APP_NAME + ".war")
//				.addPackage(MessageRestService.class.getPackage())
//				.addAsWebInfResource(new File(WEBAPP_SRC, "WEB-INF/web.xml"));
//	}
//
//	@Test
//	public void testHello() {
//		System.out.println("[Client] Requesting the WebService to say Hello.");
//
//		// Get a response from the WebService
//		final String response = client.sendBlankMessage();
//		assertEquals(response, "Helloworld!");
//
//		System.out.println("[WebService] " + response);
//
//	}
//
//}
