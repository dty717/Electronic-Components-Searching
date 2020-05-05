package ElectronicComponentsSearching.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ElectronicComponentsSearching.mapper.SearchMapper;
import ElectronicComponentsSearching.domain.SearchingContent;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    SearchMapper searchMapper;

    @Transactional
    public List<SearchingContent> getSearchContent(String searchingContent) {
        return searchMapper.getSearchContent(searchingContent);
    }
    
}
