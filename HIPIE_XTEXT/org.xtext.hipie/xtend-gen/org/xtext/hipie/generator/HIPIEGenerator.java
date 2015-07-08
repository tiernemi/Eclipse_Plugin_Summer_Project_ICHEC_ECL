/**
 * generated by Xtext
 */
package org.xtext.hipie.generator;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

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
      final String filepath_output = (_substring + "json");
      Runtime _runtime = Runtime.getRuntime();
      Process _exec = _runtime.exec((((("java -cp ./libs/HIPIE.jar org/hpcc/HIPIE/commandline/CommandLineService -databomb " + filepath) + " -o ") + filepath_output) + " -verbose"));
      Process proc = ((Process) _exec);
      InputStream in = proc.getInputStream();
      InputStream er = proc.getErrorStream();
      Scanner sc_verbose = new Scanner(in);
      Scanner sc_er = new Scanner(er);
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
      FileInputStream in_stream = new FileInputStream(filepath_output);
      String streamString_ddl = new String();
      Scanner sc_in = new Scanner(in_stream);
      boolean _hasNext_2 = sc_in.hasNext();
      if (_hasNext_2) {
        Scanner _useDelimiter_2 = sc_in.useDelimiter("\\Z");
        String _next_2 = _useDelimiter_2.next();
        streamString_ddl = _next_2;
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
      fsa.generateFile((filename + "json"), streamString_ddl);
      IWorkspace _workspace_1 = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root_1 = _workspace_1.getRoot();
      String _fileString_1 = resolvedFile.toFileString();
      Path _path_2 = new Path(_fileString_1);
      IFile _file_1 = _root_1.getFile(_path_2);
      IContainer _parent = _file_1.getParent();
      IContainer _parent_1 = _parent.getParent();
      IPath _fullPath_1 = _parent_1.getFullPath();
      String datapath = _fullPath_1.toString();
      String _datapath = datapath;
      datapath = (_datapath + "/data/");
      IWorkspace _workspace_2 = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root_2 = _workspace_2.getRoot();
      Path _path_3 = new Path(datapath);
      IContainer data_folder = _root_2.getContainerForLocation(_path_3);
      final IResource[] cont_files = data_folder.members();
      final String output_filepath = (datapath + "databomb.json");
      String data_file_paths = "";
      int _size = ((List<IResource>)Conversions.doWrapArray(cont_files)).size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        String _data_file_paths = data_file_paths;
        IResource _get = cont_files[(i).intValue()];
        String _name = _get.getName();
        String _plus = ((" " + datapath) + _name);
        data_file_paths = (_data_file_paths + _plus);
      }
      Runtime _runtime_1 = Runtime.getRuntime();
      Process _exec_1 = _runtime_1.exec(((("java -cp ./libs/HIPIE.jar org/hpcc/HIPIE/commandline/CommandLineService -csv " + data_file_paths) + " -separator \\t -escape / -quote \" -lineseparator \\n -o ") + output_filepath));
      final Process proc_data = ((Process) _exec_1);
      in.close();
      er.close();
      InputStream _inputStream = proc_data.getInputStream();
      in = _inputStream;
      InputStream _errorStream = proc_data.getErrorStream();
      er = _errorStream;
      Scanner _scanner = new Scanner(in);
      sc_verbose = _scanner;
      Scanner _scanner_1 = new Scanner(er);
      sc_er = _scanner_1;
      String _string = new String();
      streamString = _string;
      String _string_1 = new String();
      streamString_er = _string_1;
      boolean _hasNext_3 = sc_verbose.hasNext();
      if (_hasNext_3) {
        Scanner _useDelimiter_3 = sc_verbose.useDelimiter("\\Z");
        String _next_3 = _useDelimiter_3.next();
        streamString = _next_3;
      }
      boolean _hasNext_4 = sc_er.hasNext();
      if (_hasNext_4) {
        Scanner _useDelimiter_4 = sc_er.useDelimiter("\\Z");
        String _next_4 = _useDelimiter_4.next();
        streamString_er = _next_4;
      }
      System.out.println(streamString);
      System.out.println(streamString_er);
      FileInputStream _fileInputStream = new FileInputStream(output_filepath);
      in_stream = _fileInputStream;
      String streamString_data = new String();
      Scanner _scanner_2 = new Scanner(in_stream);
      sc_in = _scanner_2;
      boolean _hasNext_5 = sc_in.hasNext();
      if (_hasNext_5) {
        Scanner _useDelimiter_5 = sc_in.useDelimiter("\\Z");
        String _next_5 = _useDelimiter_5.next();
        streamString_data = _next_5;
      }
      String _replace = streamString_data.replace("\n", "");
      streamString_data = _replace;
      String _replace_1 = streamString_data.replace(" ", "");
      streamString_data = _replace_1;
      String _replace_2 = streamString_data.replace("\t", "");
      streamString_data = _replace_2;
      String _replace_3 = streamString_data.replace("\r", "");
      streamString_data = _replace_3;
      FileSystem _default_1 = FileSystems.getDefault();
      java.nio.file.Path _path_4 = _default_1.getPath(output_filepath);
      Files.delete(_path_4);
      fsa.generateFile("databomb.json", "Databomb", streamString_data);
      URL url = new URL("platform:/plugin/org.xtext.hipie/vis_files/marsh.html");
      URLConnection _openConnection = url.openConnection();
      InputStream n = _openConnection.getInputStream();
      String streamString_html = new String();
      Scanner _scanner_3 = new Scanner(n);
      sc_in = _scanner_3;
      boolean _hasNext_6 = sc_in.hasNext();
      if (_hasNext_6) {
        Scanner _useDelimiter_6 = sc_in.useDelimiter("\\Z");
        String _next_6 = _useDelimiter_6.next();
        streamString_html = _next_6;
      }
      String _replace_4 = streamString_html.replace("%_data_%", streamString_data);
      streamString_html = _replace_4;
      String _replace_5 = streamString_html.replace("%_ddl_%", streamString_ddl);
      streamString_html = _replace_5;
      fsa.generateFile("Visualization_stub.html", "HTML", streamString_html);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
