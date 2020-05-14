/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.nlp.v20190408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.nlp.v20190408.models.*;

public class NlpClient extends AbstractClient{
    private static String endpoint = "nlp.tencentcloudapi.com";
    private static String version = "2019-04-08";

    public NlpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public NlpClient(Credential credential, String region, ClientProfile profile) {
        super(NlpClient.endpoint, NlpClient.version, credential, region, profile);
    }

    /**
     *利用人工智能算法，自动抽取文本中的关键信息并生成指定长度的文本摘要。可用于新闻标题生成、科技文献摘要生成和商品评论摘要等。
     * @param req AutoSummarizationRequest
     * @return AutoSummarizationResponse
     * @throws TencentCloudSDKException
     */
    public AutoSummarizationResponse AutoSummarization(AutoSummarizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AutoSummarizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AutoSummarizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AutoSummarization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *闲聊服务基于腾讯领先的NLP引擎能力、数据运算能力和千亿级互联网语料数据的支持，同时集成了广泛的知识问答能力，可实现上百种自定义属性配置，以及儿童语言风格及说话方式，从而让聊天变得更睿智、简单和有趣。


     * @param req ChatBotRequest
     * @return ChatBotResponse
     * @throws TencentCloudSDKException
     */
    public ChatBotResponse ChatBot(ChatBotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChatBotResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ChatBotResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ChatBot"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *句法依存分析接口能够分析出句子中词与词之间的相互依存关系，并揭示其句法结构，包括主谓关系、动宾关系、核心关系等等，可用于提取句子主干、提取句子核心词等，在机器翻译、自动问答、知识抽取等领域都有很好的应用。
     * @param req DependencyParsingRequest
     * @return DependencyParsingResponse
     * @throws TencentCloudSDKException
     */
    public DependencyParsingResponse DependencyParsing(DependencyParsingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DependencyParsingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DependencyParsingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DependencyParsing"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输入实体名称，返回实体相关的信息如实体别名、实体英文名、实体详细信息、相关实体等。
     * @param req DescribeEntityRequest
     * @return DescribeEntityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEntityResponse DescribeEntity(DescribeEntityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEntityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEntityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEntity"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输入两个实体，返回两个实体间的关系，例如马化腾与腾讯公司不仅是相关实体，二者还存在隶属关系（马化腾属于腾讯公司）。
     * @param req DescribeRelationRequest
     * @return DescribeRelationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelationResponse DescribeRelation(DescribeRelationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRelationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRelationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRelation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *三元组查询，主要分为两类，SP查询和PO查询。SP查询表示已知主语和谓语查询宾语，PO查询表示已知宾语和谓语查询主语。每一个SP或PO查询都是一个可独立执行的查询，TQL支持SP查询的嵌套查询，即主语可以是一个嵌套的子查询。其他复杂的三元组查询方法，请参考官网API文档示例。
     * @param req DescribeTripleRequest
     * @return DescribeTripleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTripleResponse DescribeTriple(DescribeTripleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTripleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTripleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTriple"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *基于关键词提取平台，通过对文本内容进行深度分析，提取出文本内容中的关键信息，为用户实现诸如新闻内容关键词自动提取、评论关键词提取等提供基础服务。
     * @param req KeywordsExtractionRequest
     * @return KeywordsExtractionResponse
     * @throws TencentCloudSDKException
     */
    public KeywordsExtractionResponse KeywordsExtraction(KeywordsExtractionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KeywordsExtractionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<KeywordsExtractionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "KeywordsExtraction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *词法分析接口提供以下三个功能：

1、智能分词：将连续的自然语言文本，切分成具有语义合理性和完整性的词汇序列；

2、词性标注：为每一个词附上对应的词性，例如名词、代词、形容词、动词等；

3、命名实体识别：快速识别文本中的实体，例如人名、地名、机构名等。

所有的功能均基于千亿级大规模互联网语料进行持续迭代更新，以保证效果不断提升，用户无需担心新词发现、歧义消除、调用性能等问题。目前词法分析已经在泛互联网、金融、政务等不同垂直领域提供业务支持，并取得良好的效果。
     * @param req LexicalAnalysisRequest
     * @return LexicalAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public LexicalAnalysisResponse LexicalAnalysis(LexicalAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LexicalAnalysisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<LexicalAnalysisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "LexicalAnalysis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *句向量接口能够将输入的句子映射成一个固定维度的向量，用来表示这个句子的语义特征，可用于文本聚类、文本相似度、文本分类等任务，能够显著提高它们的效果。

该句向量服务由腾讯知文自然语言处理团队联合腾讯AI Lab共同打造，基于千亿级大规模互联网语料并采用AI Lab自研的DSG算法训练而成，在腾讯内部诸多业务的NLP任务上实测效果显著。
     * @param req SentenceEmbeddingRequest
     * @return SentenceEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public SentenceEmbeddingResponse SentenceEmbedding(SentenceEmbeddingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceEmbeddingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceEmbeddingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SentenceEmbedding"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本相似度接口能够基于深度学习技术来计算两个输入文本的相似度，相似度数值越大的两个文本在语义上越相似。目前仅支持短文本的相似度计算，长文本的相似度计算也即将推出。

鉴于文本相似度是一个应用非常广泛的功能，腾讯知文自然语言处理团队在深度神经网络模型的基础上，专门针对文本相似任务进行了优化，并持续迭代更新。基于文本相似度，可以轻松实现诸如文本去重、相似推荐等功能。
     * @param req SentenceSimilarityRequest
     * @return SentenceSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public SentenceSimilarityResponse SentenceSimilarity(SentenceSimilarityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceSimilarityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceSimilarityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SentenceSimilarity"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *情感分析接口能够对带有情感色彩的主观性文本进行分析、处理、归纳和推理，识别出用户的情感倾向，是积极还是消极，并且提供各自概率。

该功能基于基于千亿级大规模互联网语料和LSTM、BERT等深度神经网络模型进行训练，并持续迭代更新，以保证效果不断提升。
     * @param req SentimentAnalysisRequest
     * @return SentimentAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public SentimentAnalysisResponse SentimentAnalysis(SentimentAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentimentAnalysisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SentimentAnalysisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SentimentAnalysis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *相似词接口能够基于同义词库及词向量技术，检索出与输入词语在语义上最相似的若干个词语，可广泛用于检索系统、问答系统、文档归档等场景。
     * @param req SimilarWordsRequest
     * @return SimilarWordsResponse
     * @throws TencentCloudSDKException
     */
    public SimilarWordsResponse SimilarWords(SimilarWordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SimilarWordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SimilarWordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SimilarWords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本分类接口能够对用户输入的文本进行自动分类，将其映射到具体的类目上，用户只需要提供待分类的文本，而无需关注具体实现。

该功能基于基于千亿级大规模互联网语料和LSTM、BERT等深度神经网络模型进行训练，并持续迭代更新，以保证效果不断提升。

目前已提供：

- 通用领域分类体系，包括15个分类类目，分别是汽车、科技、健康、体育、旅行、教育、职业、文化、军事、房产、娱乐、女性、奥运、财经以及其他，适用于通用的场景。

- 新闻领域分类体系，包括37个一级分类类目，285个二级分类（详细请见 [类目体系映射表](https://cloud.tencent.com/document/product/271/36459)），已应用于腾讯新闻的文章分类。

更多垂直领域的分类体系即将推出，敬请期待。
     * @param req TextClassificationRequest
     * @return TextClassificationResponse
     * @throws TencentCloudSDKException
     */
    public TextClassificationResponse TextClassification(TextClassificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextClassificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TextClassificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TextClassification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供对中文文本的自动纠错功能，能够识别输入文本中的错误片段，定位错误并给出正确的文本结果；支持长度不超过2000字的长文本纠错。

此功能是基于千亿级大规模互联网语料和LSTM、BERT等深度神经网络模型进行训练，并持续迭代更新，以保证效果不断提升，是搜索引擎、语音识别、内容审核等功能更好运行的基础之一。 
     * @param req TextCorrectionRequest
     * @return TextCorrectionResponse
     * @throws TencentCloudSDKException
     */
    public TextCorrectionResponse TextCorrection(TextCorrectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextCorrectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TextCorrectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TextCorrection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *词向量接口能够将输入的词语映射成一个固定维度的词向量，用来表示这个词语的语义特征。词向量是很多自然语言处理技术的基础，能够显著提高它们的效果。

该词向量服务由腾讯知文自然语言处理团队联合腾讯AI Lab共同打造。使用的词向量基于千亿级大规模互联网语料并采用AI Lab自研的DSG算法训练而成，开源的词向量包含800多万中文词汇，在覆盖率、新鲜度及准确性等三方面性能突出。

腾讯AI Lab词向量相关资料：

https://ai.tencent.com/ailab/zh/news/detial?id=22

https://ai.tencent.com/ailab/nlp/embedding.html 
     * @param req WordEmbeddingRequest
     * @return WordEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public WordEmbeddingResponse WordEmbedding(WordEmbeddingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WordEmbeddingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<WordEmbeddingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "WordEmbedding"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *词相似度接口能够基于词向量技术来计算两个输入词语的余弦相似度，相似度数值越大的两个词语在语义上越相似。
     * @param req WordSimilarityRequest
     * @return WordSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public WordSimilarityResponse WordSimilarity(WordSimilarityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WordSimilarityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<WordSimilarityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "WordSimilarity"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
