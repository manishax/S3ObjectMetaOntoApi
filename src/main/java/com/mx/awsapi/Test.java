package com.mx.awsapi;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.mx.awsapi.model.VideoObjectMetadata;



public class Test {

	
	public static void main(String[] args){
//		try{
//		String pathName="/home/manisha/ManishaOntologies/S3ObjectMetaOnto/S3ObjectMetaOnto.owl";
//		File owlFile=new File(pathName);
//		FileReader owlFileReader=new FileReader(owlFile);
//		OntModel model=ModelFactory.createOntologyModel();
//		model.read(owlFileReader, null);
//		Iterator classIter=model.listClasses();
//		while(classIter.hasNext()){
//			OntClass ontClass=(OntClass)classIter.next();
//			System.out.println(ontClass.getURI());
//		}
//		
//		AWSCredentials awsCredentials = new BasicAWSCredentials(accessid,accesskey);
//		AmazonS3 s3Client = new AmazonS3Client(awsCredentials);
//		
//		String bucketname="test-bucket-manisha";
//		//s3Client.createBucket(bucketname);
//		
//	    for (Bucket bucket : s3Client.listBuckets()) {
//	    	System.out.println(" - " + bucket.getName());
//	    }
//	    
//	    VideoObjectMetadata vom=new VideoObjectMetadata();
//	    vom.setFormat("mp4");
//	    
//	    
//	    
//		}catch(Exception e){
//			
//			System.out.println("message:"+e);
//		}	
//			
			
		}
	}
