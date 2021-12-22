package com.example.demo1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.*;

public class FilePerm {
	public static void main(String srgs[]) throws IOException
	{
		File f = new File("C:/Users/Gchoudhari/Desktop/eeee");
	
	       Set<PosixFilePermission> perms = Files.readAttributes(f.toPath(),PosixFileAttributes.class).permissions();

	       System.out.format("Permissions before:",  PosixFilePermissions.toString(perms));

	        perms.add(PosixFilePermission.OWNER_WRITE);
	        perms.add(PosixFilePermission.OWNER_READ);
	        perms.add(PosixFilePermission.OWNER_EXECUTE);
	        perms.add(PosixFilePermission.GROUP_WRITE);
	        perms.add(PosixFilePermission.GROUP_READ);
	        perms.add(PosixFilePermission.GROUP_EXECUTE);
	        perms.add(PosixFilePermission.OTHERS_WRITE);
	        perms.add(PosixFilePermission.OTHERS_READ);
	        perms.add(PosixFilePermission.OTHERS_EXECUTE);
	        Files.setPosixFilePermissions(f.toPath(), perms);

	        System.out.format("Permissions after: ",  PosixFilePermissions.toString(perms));
	}

}
