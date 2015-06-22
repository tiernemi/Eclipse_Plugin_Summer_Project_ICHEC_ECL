package src.editor.CMP;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class CMPSourceViewerConfig extends TextSourceViewerConfiguration {

  public CMPSourceViewerConfig() {
    this(null);
  }

  public CMPSourceViewerConfig(IPreferenceStore preferenceStore) {
    super(preferenceStore);    
    // enable auto activation
  }

  @Override
  public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {

		PresentationReconciler pr = new PresentationReconciler();
        DefaultDamagerRepairer ddr = new DefaultDamagerRepairer(new CMPScanner());
        pr.setRepairer(ddr, IDocument.DEFAULT_CONTENT_TYPE);
        pr.setDamager(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		return pr;
	}
  
  @Override
  public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, 
		    String contentType) {
      IAutoEditStrategy strategy= (IDocument.DEFAULT_CONTENT_TYPE.equals(contentType) 
      ? new CMPAutoCompleteStringBrac() : new DefaultIndentLineAutoEditStrategy());
      
      return new IAutoEditStrategy[] {strategy}  ;
  }
} 