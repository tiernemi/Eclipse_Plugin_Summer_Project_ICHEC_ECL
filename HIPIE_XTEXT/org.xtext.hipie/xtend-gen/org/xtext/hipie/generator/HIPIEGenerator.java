/**
 * generated by Xtext
 */
package org.xtext.hipie.generator;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.Scanner;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class HIPIEGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      URI _uRI = resource.getURI();
      URI resolvedFile = CommonPlugin.resolve(_uRI);
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      String _fileString = resolvedFile.toFileString();
      Path _path = new Path(_fileString);
      IFile _file = _root.getFile(_path);
      IPath _fullPath = _file.getFullPath();
      final String filepath = _fullPath.toString();
      String _lastSegment = resolvedFile.lastSegment();
      String _lastSegment_1 = resolvedFile.lastSegment();
      int _length = _lastSegment_1.length();
      int _minus = (_length - 3);
      final String filename = _lastSegment.substring(0, _minus);
      int _length_1 = filepath.length();
      int _minus_1 = (_length_1 - 3);
      String _substring = filepath.substring(0, _minus_1);
      final String filepath_output = (_substring + "out");
      Runtime _runtime = Runtime.getRuntime();
      Process _exec = _runtime.exec((((("java -cp ./libs/HIPIE.jar org/hpcc/HIPIE/commandline/CommandLineService -c " + filepath) + " -o ") + filepath_output) + " -verbose"));
      final Process proc = ((Process) _exec);
      final InputStream in = proc.getInputStream();
      final InputStream er = proc.getErrorStream();
      final Scanner sc_verbose = new Scanner(in);
      final Scanner sc_er = new Scanner(er);
      String streamString = new String();
      String streamString_er = new String();
      boolean _hasNext = sc_verbose.hasNext();
      if (_hasNext) {
        Scanner _useDelimiter = sc_verbose.useDelimiter("\\Z");
        String _next = _useDelimiter.next();
        streamString = _next;
      }
      boolean _hasNext_1 = sc_er.hasNext();
      if (_hasNext_1) {
        Scanner _useDelimiter_1 = sc_er.useDelimiter("\\Z");
        String _next_1 = _useDelimiter_1.next();
        streamString_er = _next_1;
      }
      System.out.println(streamString);
      System.out.println(streamString_er);
      final FileInputStream in_stream = new FileInputStream(filepath_output);
      String streamString_in = new String();
      final Scanner sc_in = new Scanner(in_stream);
      boolean _hasNext_2 = sc_in.hasNext();
      if (_hasNext_2) {
        Scanner _useDelimiter_2 = sc_in.useDelimiter("\\Z");
        String _next_2 = _useDelimiter_2.next();
        streamString_in = _next_2;
      }
      in.close();
      er.close();
      in_stream.close();
      sc_in.close();
      sc_verbose.close();
      sc_er.close();
      FileSystem _default = FileSystems.getDefault();
      java.nio.file.Path _path_1 = _default.getPath(filepath_output);
      Files.delete(_path_1);
      fsa.generateFile((filename + "out"), streamString_in);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
